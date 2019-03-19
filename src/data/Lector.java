package data;

import Logico.Palta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Lector {

    public ArrayList<Palta> leerCsv() {
        String archivoCsv = "PrecioPaltas.csv";
        ArrayList<String> linea = new ArrayList<>();
        ArrayList<Palta> paltas = new ArrayList<>();
        String line = null;
        try {
            FileReader fr = new FileReader(archivoCsv);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                linea.add(line);
            }
            System.out.println(linea.get(1));
            paltas = separarDatos(linea);

        }catch (Exception e){

        }
        return paltas;
    }

    private ArrayList<Palta> separarDatos(ArrayList<String> linea){
        ArrayList<Palta> paltas = new ArrayList<>();
        String[] lineas = new String[13];
        for(String item : linea){
            lineas = item.split(",");
            Palta palta = new Palta(lineas[1],lineas[2],lineas[3],lineas[4],lineas[5],lineas[6],lineas[7],lineas[8],lineas[9],lineas[10],lineas[11],lineas[12],lineas[13]);
            paltas.add(palta);
        }
        return paltas;
    }
}
