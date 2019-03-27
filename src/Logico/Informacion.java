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
        System.out.println("La palta mas barata es "+this.paltas.get(0).getAveragePrice());
    }
}
