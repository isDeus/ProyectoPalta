import Logico.ClasificadorPalta;
import Logico.Palta;
import data.Lector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClasificadorPaltaTest {

    private ArrayList<Palta> paltas = new ArrayList<>();
    ClasificadorPalta clasificadorPalta;

    @Before
    public void setUp(){
        Palta plt1 = new Palta("2015-12-26", 0.45, 30876.99,675.29,44638.82,58.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "Albany");
        Palta plt2 = new Palta("2016-11-16", 1.45, 40876.99,775.29,54638.82,68.33,9505.45,9404.7,98.45,0.0,"organic", 2016, "Boston");
        Palta plt3 = new Palta("2017-10-06", 2.45, 50876.99,875.29,64638.82,78.33,9505.45,9404.7,98.45,0.0,"conventional", 2017, "California");
        Palta plt4 = new Palta("2018-09-26", 3.45, 60876.99,975.29,74638.82,88.33,9505.45,9404.7,98.45,0.0,"organic", 2018, "Denver");
        Palta plt5 = new Palta("2015-08-16", 4.45, 70876.99,575.29,84638.82,98.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "GreatLakes");
        Palta plt6 = new Palta("2016-07-06", 5.45, 80876.99,475.29,94638.82,58.33,9505.45,9404.7,98.45,0.0,"organic", 2016, "Houston");
        paltas.add(plt1);
        paltas.add(plt2);
        paltas.add(plt3);
        paltas.add(plt4);
        paltas.add(plt5);
        paltas.add(plt6);
        clasificadorPalta = new ClasificadorPalta(paltas);
    }

    @Test
    public void obtenerPrecioBajo() {
        Palta paltaBarata = clasificadorPalta.obtenerPrecioBajo();
        Assert.assertEquals(0.45, paltaBarata.getAveragePrice(), 0);
    }

    @Test
    public void listarPreciosBaratos() {
        ArrayList<Palta> paltasLugares = clasificadorPalta.listarPreciosBaratos(2);
        ArrayList<Palta> paltasEsperadas = new ArrayList<>();
        paltasEsperadas.add(new Palta("2015-12-26", 0.45, 30876.99,675.29,44638.82,58.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "Albany"));
        paltasEsperadas.add(new Palta("2016-11-16", 1.45, 40876.99,775.29,54638.82,68.33,9505.45,9404.7,98.45,0.0,"organic", 2016, "Boston"));
        Assert.assertEquals(paltasLugares.get(1).getAveragePrice(), paltasEsperadas.get(1).getAveragePrice(),0);
    }

    @Test
    public void obtenerPorAño() {
        ArrayList<Palta> paltasAño = clasificadorPalta.obtenerPorAño(2015);
        ArrayList<Palta> paltasEsperadas = new ArrayList<>();
        paltasEsperadas.add(new Palta("2015-12-26", 0.45, 30876.99,675.29,44638.82,58.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "Albany"));
        paltasEsperadas.add(new Palta("2015-08-16", 4.45, 70876.99,575.29,84638.82,98.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "GreatLakes"));
        Assert.assertEquals(paltasAño.size(), paltasEsperadas.size());
    }

    @Test
    public void obtenerIntervaloAño() {
        ArrayList<Palta> paltasIntervaloAño = clasificadorPalta.obtenerIntervaloAño(2015, 2016);
        ArrayList<Palta> paltasEsperadas = new ArrayList<>();
        paltasEsperadas.add(new Palta("2015-12-26", 0.45, 30876.99,675.29,44638.82,58.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "Albany"));
        paltasEsperadas.add(new Palta("2015-08-16", 4.45, 70876.99,575.29,84638.82,98.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "GreatLakes"));
        paltasEsperadas.add(new Palta("2016-11-16", 1.45, 40876.99,775.29,54638.82,68.33,9505.45,9404.7,98.45,0.0,"organic", 2016, "Boston"));
        paltasEsperadas.add(new Palta("2016-07-06", 5.45, 80876.99,475.29,94638.82,58.33,9505.45,9404.7,98.45,0.0,"organic", 2016, "Houston"));
        Assert.assertEquals(paltasIntervaloAño.size(), paltasEsperadas.size());
    }

    @Test
    public void obtenerIntervaloPrecio() {
        ArrayList<Palta> paltasIntervaloPrecio = clasificadorPalta.obtenerIntervaloPrecio(0.45, 1.45);
        ArrayList<Palta> paltasEsperadas = new ArrayList<>();
        paltasEsperadas.add(new Palta("2015-12-26", 0.45, 30876.99,675.29,44638.82,58.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "Albany"));
        paltasEsperadas.add(new Palta("2016-11-16", 1.45, 40876.99,775.29,54638.82,68.33,9505.45,9404.7,98.45,0.0,"organic", 2016, "Boston"));
        Assert.assertEquals(paltasIntervaloPrecio.size(), paltasEsperadas.size());
    }

    @Test
    public void obtenerPorRegion() {
        ArrayList<Palta> paltasRegion = clasificadorPalta.obtenerPorRegion("Albany");
        ArrayList<Palta> paltasEsperadas = new ArrayList<>();
        paltasEsperadas.add(new Palta("2015-12-26", 0.45, 30876.99,675.29,44638.82,58.33,9505.45,9404.7,98.45,0.0,"conventional", 2015, "Albany"));
        Assert.assertEquals(paltasRegion.size(), paltasEsperadas.size());
    }

    @Test
    public void obtenerPorTipo() {
        ArrayList<Palta> paltasTipo = clasificadorPalta.obtenerPorTipo("organic");
        ArrayList<Palta> paltasEsperadas = new ArrayList<>();
        paltasEsperadas.add(new Palta("2016-11-16", 1.45, 40876.99,775.29,54638.82,68.33,9505.45,9404.7,98.45,0.0,"organic", 2016, "Boston"));
        paltasEsperadas.add(new Palta("2018-09-26", 3.45, 60876.99,975.29,74638.82,88.33,9505.45,9404.7,98.45,0.0,"organic", 2018, "Denver"));
        paltasEsperadas.add(new Palta("2016-07-06", 5.45, 80876.99,475.29,94638.82,58.33,9505.45,9404.7,98.45,0.0,"organic", 2016, "Houston"));
        Assert.assertEquals(paltasTipo.size(), paltasEsperadas.size());
    }

    @Test
    public void sortPrecio() {
        clasificadorPalta.sortPrecio();
        Assert.assertEquals(0.45, paltas.get(0).getAveragePrice(), 0);
    }

    @Test
    public void sortAño() {
        clasificadorPalta.sortAño();
        Assert.assertEquals(2015, paltas.get(0).getYear());
    }

    @Test
    public void sortTipo() {
        clasificadorPalta.sortTipo();
        Assert.assertEquals("conventional", paltas.get(0).getType());
    }

    @Test
    public void sortRegionTipo() {

    }
}