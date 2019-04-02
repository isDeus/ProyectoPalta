package Estructura;

import Logico.Palta;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class QueuePalta {
    ArrayList<Palta> paltas;

    public QueuePalta(ArrayList<Palta> arreglo){

        this.paltas = arreglo;
    }

    public Palta add(Palta object){
        this.paltas.add(object);
        return object;
    }

    public Palta remove(){
        if(this.paltas.size() == 0){
            throw new NoSuchElementException();
        }
        Palta palta = this.paltas.get(0);
        this.paltas.remove(0);
        return palta;
    }

    public Palta peek(){
        if(this.paltas.size() != 0){
            return this.paltas.get(0);
        } else {
            throw new NoSuchElementException();
        }
    }

}
