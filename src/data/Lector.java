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
            br.readLine();
            while ((line = br.readLine()) != null) {
                linea.add(line);
            }
            paltas = separarDatos(linea);

        }catch (Exception e){
            System.out.println("error");
        }
        return paltas;
    }

    private ArrayList<Palta> separarDatos(ArrayList<String> linea){
        System.out.println(linea.get(0));
        ArrayList<Palta> paltas = new ArrayList<>();
        String[] lineas = new String[14];
        for(String item : linea){
            lineas = item.split(",");
            Palta palta = new Palta(lineas[1],Double.parseDouble(lineas[2]),Double.parseDouble(lineas[3]),Double.parseDouble(lineas[4]),Double.parseDouble(lineas[5]),Double.parseDouble(lineas[6]),Double.parseDouble(lineas[7]),Double.parseDouble(lineas[8]),Double.parseDouble(lineas[9]),Double.parseDouble(lineas[10]),lineas[11],Integer.parseInt(lineas[12]),lineas[13]);
            paltas.add(palta);
        }
        return paltas;
    }
}
