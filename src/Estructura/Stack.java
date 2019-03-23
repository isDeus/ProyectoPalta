package Estructura;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack {

    ArrayList<Object> arreglo;

    public Stack(ArrayList<Object> array){

        this.arreglo = array;
    }

    public Object push(Object object){
        this.arreglo.add(object);
        return object;
    }

    public Object pop(){
        if(this.arreglo.size() == 0){
            throw new EmptyStackException();
        }
        else
        {
            return this.arreglo.remove(this.arreglo.size()-1);
        }
    }

    public Object peek(){
        if (this.arreglo.isEmpty()){
            throw new EmptyStackException();
        }
        else
        {
            return this.arreglo.get(this.arreglo.size()-1);
        }
    }

    public int search(Object object){
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
