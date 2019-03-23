package Estructura;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue {
    ArrayList<Object> arreglo;

    public Queue(ArrayList<Object> arreglo){
        this.arreglo = arreglo;
    }

    public void add(Object object){
        this.arreglo.add(object);
    }

    public void remove(){
        if(this.arreglo.size() == 0){
            throw new NoSuchElementException();
        }
        this.arreglo.remove(0);
    }

    public Object peek(){
        if(this.arreglo.size() == 0){
            return false;
        }
        return this.arreglo.get(0);
    }

}
