import Estructura.QueuePalta;
import Logico.Palta;
import data.Lector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Queue;

import static org.junit.Assert.*;

public class QueuePaltaTest {

    private ArrayList<Palta> paltas;
    Palta pl = new Palta("2015-12-26", 1.45, 54876.99,675.29,44638.82,58.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "Albany");
    QueuePalta queue;

    @Before
    public void setUp(){
        Lector lc = new Lector();
        paltas = lc.leerCsv();
        queue = new QueuePalta(paltas);
    }

    @Test
    public void add() {
        Palta paltaTest = queue.add(pl);
        Assert.assertEquals(pl,paltaTest);
    }

    @Test
    public void remove() {
        Palta paltaEsperada = new Palta("2015-12-20",1.35, 54876.98, 674.28, 44638.81, 58.33, 9505.56, 9408.07, 97.49, 0.0, "conventional", 2015, "Albany");
        queue.remove();
        Palta paltaTest = queue.peek();
        Assert.assertEquals(paltaEsperada.getDate(), paltaTest.getDate());
    }

    @Test
    public void peek() {
        Palta paltaEsperada = new Palta("2015-12-27",1.33, 64236.62, 1036.74, 54454.85, 48.16, 8696.87, 8603.62, 93.25, 0.0, "conventional", 2015, "Albany");
        Palta paltaTest = queue.remove();
        Assert.assertEquals(paltaEsperada.getDate(), paltaTest.getDate());
    }
}