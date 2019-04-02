package Estructura;

import Logico.Palta;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackPalta {

    ArrayList<Palta> arreglo;

    public StackPalta(ArrayList<Palta> array){

        this.arreglo = array;
    }

    public Palta push(Palta object){
        this.arreglo.add(object);
        return object;
    }

    public Palta pop(){
        if(this.arreglo.size() == 0){
            throw new EmptyStackException();
        }
        else
        {
            return this.arreglo.remove(this.arreglo.size()-1);
        }
    }

    public Palta peek(){
        if (this.arreglo.isEmpty()){
            throw new EmptyStackException();
        }
        else
        {
            return this.arreglo.get(this.arreglo.size()-1);
        }
    }

    public int search(Palta object){
        if (this.arreglo.size() == 0){
            return -1;
        }
        else if(this.arreglo.contains(object)){
            return this.arreglo.indexOf(object)+1;
        }
        else{
            return -1;
        }
    }
}
