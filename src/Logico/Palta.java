package Logico;

public class Palta {

    private String date;
    private double averagePrice;
    private double totalVolume;
    private int plu4046;
    private int plu4225;
    private int plu4770;
    private double totalBags;
    private double smallBags;
    private double largeBags;
    private double xLargeBags;
    private String type;
    private int year;
    private String region;

    //Cambiarle los tipos de datos de String a sus datos correspondientes. Aprender a usar date
    public Palta(String date, double averagePrice, double totalVolume, int plu4046, int plu4225, int plu4770, double totalBags, double smallBags, double largeBags, double xLargeBags, String type, int year, String region) {
        this.date = date;
        this.averagePrice = averagePrice;
        this.totalVolume = totalVolume;
        this.plu4046 = plu4046;
        this.plu4225 = plu4046;
        this.plu4770 = plu4225;
        this.totalBags = totalBags;
        this.smallBags = smallBags;
        this.largeBags = largeBags;
        this.xLargeBags = xLargeBags;
        this.type = type;
        this.year = year;
        this.region = region;
    }
}
