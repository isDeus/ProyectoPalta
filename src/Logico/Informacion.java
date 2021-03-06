package Logico;

import data.Lector;

import java.util.*;

public class Informacion {

    ArrayList<Palta> paltas;

    public Informacion(){
        Lector lc = new Lector();
        this.paltas = lc.leerCsv();
    }


    public void MenuPrincipal(){

        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while(true){
            System.out.println("Eliga la opcion correspondiente");
            System.out.println("1)Buscar palta");
            System.out.println("2)Buscar palta mas barata");
            System.out.println("3)Salir del menu");
            int eleccion = sc.nextInt();
            switch(eleccion) {
                case 1:
                    System.out.println("Ingrese la region");
                    buscarPalta(paltas, "Albany");
                    break;
                case 2 :
                    buscarPaltaBarata();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private void buscarPalta(ArrayList<Palta> paltas, String region){
        Iterator<Palta> it = paltas.iterator();
        System.out.println("Starting");
        while(it.hasNext()){
            Palta palta = it.next();
            if(palta.getRegion().equals(region)){
                System.out.println(palta.getDate());
            }
        }
        System.out.println("done");
    }

    private void buscarPaltaBarata(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getAveragePrice);
        Collections.sort(this.paltas, cmp);
        mostrarPalta(this.paltas.get(0));
    }

    private void mostrarPalta(Palta palta){
        System.out.println("Los datos de la palta son:");
        System.out.println("Date "+palta.getDate()+" , AveragePrice "+palta.getAveragePrice());
        System.out.println("Total Volume "+palta.getTotalVolume()+" , PLU4046 "+palta.getPlu4046());
        System.out.println("PLU4225 "+palta.getPlu4225()+" , PLU4770 "+palta.getPlu4770());
        System.out.println("Total Bags "+palta.getTotalBags()+" , Small Bags "+palta.getSmallBags());
        System.out.println("Large Bags "+palta.getLargeBags()+" , XLarge Bags "+palta.getxLargeBags());
        System.out.println("Type "+palta.getType()+" , Year "+palta.getYear());
        System.out.println("Region "+palta.getRegion());
    }

    private void listarPreciosBaratos(int lugares){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getAveragePrice);
        Collections.sort(this.paltas, cmp);
        for(int i = 0; i < lugares; i++){
            mostrarPalta(this.paltas.get(i));
        }
    }

    private ArrayList<Palta> obtenerPorAño(int año){
        ArrayList<Palta> paltasAño = new ArrayList<>();
        Iterator<Palta> it = this.paltas.iterator();
        while(it.hasNext()){
                Palta palta = it.next();
                if(palta.getYear() == año){
                    paltasAño.add(palta);
                }
        }
        return paltasAño;
    }

    private ArrayList<Palta> obtenerIntervaloAño(int año1, int año2){
        int añoCambiable;
        if(año1 > año2){
            añoCambiable = año1;
            año1 = año2;
            año2 = añoCambiable;
        }
        ArrayList<Palta> paltasAño = new ArrayList<>();
        Iterator<Palta> it = this.paltas.iterator();
        while(it.hasNext()){
            Palta palta = it.next();
            if(palta.getYear() >= año1 && palta.getYear() <= año2){
                paltasAño.add(palta);
            }
        }
        return paltasAño;
    }

    private ArrayList<Palta> obtenerIntervaloPrecio(int precio1, int precio2){
        int precioCambiable;
        if(precio1 > precio2){
            precioCambiable = precio1;
            precio1 = precio2;
            precio2 = precioCambiable;
        }
        ArrayList<Palta> paltasPrecio = new ArrayList<>();
        Iterator<Palta> it = this.paltas.iterator();
        while(it.hasNext()){
            Palta palta = it.next();
            if(palta.getAveragePrice() >= precio1 && palta.getAveragePrice() <= precio2){
                paltasPrecio.add(palta);
            }
        }
        return paltasPrecio;
    }

    private ArrayList<Palta> obtenerPorRegion(String region){
        ArrayList<Palta> paltasRegion = new ArrayList<>();
        Iterator<Palta> it = this.paltas.iterator();
        while(it.hasNext()){
            Palta palta = it.next();
            if(palta.getRegion().equals(region)){
                paltasRegion.add(palta);
            }
        }
        return paltasRegion;
    }

    private ArrayList<Palta> obtenerPorTipo(String tipo){
        ArrayList<Palta> paltasTipo = new ArrayList<>();
        Iterator<Palta> it = this.paltas.iterator();
        while(it.hasNext()){
            Palta palta = it.next();
            if(palta.getType().equals(tipo)){
                paltasTipo.add(palta);
            }
        }
        return paltasTipo;
    }

    private void sortPrecio(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getAveragePrice);
        Collections.sort(this.paltas, cmp);
    }

    private void sortAño(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getYear);
        Collections.sort(this.paltas, cmp);
    }

    private void sortTipo(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getType);
        Collections.sort(this.paltas, cmp);
    }

    private void sortRegionTipo(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getRegion);
        Collections.sort(this.paltas, cmp);
    }
}
