import Estructura.StackPalta;
import Logico.Palta;
import data.Lector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StackPaltaTest {
    private ArrayList<Palta> paltas;
    Palta pl = new Palta("2015-12-26", 1.45, 54876.99,675.29,44638.82,58.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "Albany");
    StackPalta stack;

    @Before
    public void setUp(){
        Lector lc = new Lector();
        paltas = lc.leerCsv();
        stack = new StackPalta(paltas);
    }

    @Test
    public void push() {
        Palta paltaTest = stack.push(pl);
        Assert.assertEquals(pl, paltaTest);
    }

    @Test
    public void pop() {
        Palta paltaEsperada = new Palta("2018-01-07",1.62, 17489.58, 2894.77, 2356.13, 224.53, 12014.15, 11988.14, 26.01, 0.0, "organic", 2018, "WestTexNewMexico");
        Palta paltaTest = stack.pop();
        Assert.assertEquals(paltaEsperada.getTotalVolume(), paltaTest.getTotalVolume(),0);
    }

    @Test
    public void peek() {
        Palta paltaEsperada = new Palta("2018-01-07",1.62, 17489.58, 2894.77, 2356.13, 224.53, 12014.15, 11988.14, 26.01, 0.0, "organic", 2018, "WestTexNewMexico");
        Palta paltaTest = stack.peek();
        Assert.assertEquals(paltaEsperada.getTotalVolume(), paltaTest.getTotalVolume(),0);
    }

    @Test
    public void search() {
        int numero = stack.search(stack.peek());
        Assert.assertEquals(18249, numero);
    }
}