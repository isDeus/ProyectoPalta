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
        System.out.println("Los datos de la palta mas barata son:");
        System.out.println("Date "+this.paltas.get(0).getDate()+" , AveragePrice "+this.paltas.get(0).getAveragePrice());
        System.out.println("Total Volume "+this.paltas.get(0).getTotalVolume()+" , PLU4046 "+this.paltas.get(0).getPlu4046());
        System.out.println("PLU4225 "+this.paltas.get(0).getPlu4225()+" , PLU4770 "+this.paltas.get(0).getPlu4770());
        System.out.println("Total Bags "+this.paltas.get(0).getTotalBags()+" , Small Bags "+this.paltas.get(0).getSmallBags());
        System.out.println("Large Bags "+this.paltas.get(0).getLargeBags()+" , XLarge Bags "+this.paltas.get(0).getxLargeBags());
        System.out.println("Type "+this.paltas.get(0).getType()+" , Year "+this.paltas.get(0).getYear());
        System.out.println("Region "+this.paltas.get(0).getRegion());
    }

    private void listarPreciosBaratos(int lugares){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getAveragePrice);
        Collections.sort(this.paltas, cmp);
        for(int i = 0; i < lugares; i++){

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
        ArrayList<Palta> paltasAño = new ArrayList<>();

        return paltasAño;
    }

    private ArrayList<Palta> obtenerIntervaloPrecio(int precio1, int precio2){
        ArrayList<Palta> paltasPrecio = new ArrayList<>();

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

    }

    private void sortAño(){

    }

    private void sortTipo(){

    }

    private void sortRegionTipo(){

    }
}
