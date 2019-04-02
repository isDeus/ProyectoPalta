package Logico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ClasificadorPalta {

    ArrayList<Palta> paltas;

    public ClasificadorPalta(ArrayList<Palta> paltas){
        this.paltas = paltas;
    }

    public Palta obtenerPrecioBajo(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getAveragePrice);
        Collections.sort(this.paltas, cmp);
        mostrarPalta(this.paltas.get(0));
        return this.paltas.get(0);
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

    public ArrayList<Palta> listarPreciosBaratos(int lugares){
        ArrayList<Palta> paltasLugares = new ArrayList<>();
        Comparator<Palta> cmp = Comparator.comparing(Palta::getAveragePrice);
        Collections.sort(this.paltas, cmp);
        for(int i = 0; i < lugares; i++){
            mostrarPalta(this.paltas.get(i));
            paltasLugares.add(this.paltas.get(i));
        }
        return paltasLugares;
    }

    public ArrayList<Palta> obtenerPorAño(int año){
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

    public ArrayList<Palta> obtenerIntervaloAño(int año1, int año2){
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
        Comparator<Palta> cmp = Comparator.comparing(Palta::getYear);
        Collections.sort(paltasAño, cmp);
        return paltasAño;
    }

    public ArrayList<Palta> obtenerIntervaloPrecio(double precio1, double precio2){
        double precioCambiable;
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
        Comparator<Palta> cmp = Comparator.comparing(Palta::getAveragePrice);
        Collections.sort(paltasPrecio, cmp);
        return paltasPrecio;
    }

    public ArrayList<Palta> obtenerPorRegion(String region){
        ArrayList<Palta> paltasRegion = new ArrayList<>();
        Iterator<Palta> it = this.paltas.iterator();
        while(it.hasNext()){
            Palta palta = it.next();
            if(palta.getRegion().equals(region)){
                paltasRegion.add(palta);
            }
        }
        Comparator<Palta> cmp = Comparator.comparing(Palta::getRegion);
        Collections.sort(paltasRegion, cmp);
        return paltasRegion;
    }

    public ArrayList<Palta> obtenerPorTipo(String tipo){
        ArrayList<Palta> paltasTipo = new ArrayList<>();
        Iterator<Palta> it = this.paltas.iterator();
        while(it.hasNext()){
            Palta palta = it.next();
            if(palta.getType().equals(tipo)){
                paltasTipo.add(palta);
            }
        }
        Comparator<Palta> cmp = Comparator.comparing(Palta::getType);
        Collections.sort(paltasTipo, cmp);
        return paltasTipo;
    }

    public void sortPrecio(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getAveragePrice);
        Collections.sort(this.paltas, cmp);
    }

    public void sortAño(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getYear);
        Collections.sort(this.paltas, cmp);
    }

    public void sortTipo(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getType);
        Collections.sort(this.paltas, cmp);
    }

    public void sortRegionTipo(){
        Comparator<Palta> cmp = Comparator.comparing(Palta::getRegion);
        Collections.sort(this.paltas, cmp);
    }
}
