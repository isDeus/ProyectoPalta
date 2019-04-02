package Logico;

public class Palta {

    private String date;
    private double averagePrice;
    private double totalVolume;
    private double plu4046;
    private double plu4225;
    private double plu4770;
    private double totalBags;
    private double smallBags;
    private double largeBags;
    private double xLargeBags;
    private String type;
    private int year;
    private String region;

    public Palta(String date, double averagePrice, double totalVolume, double plu4046, double plu4225, double plu4770, double totalBags, double smallBags, double largeBags, double xLargeBags, String type, int year, String region) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public double getPlu4046() {
        return plu4046;
    }

    public void setPlu4046(double plu4046) {
        this.plu4046 = plu4046;
    }

    public double getPlu4225() {
        return plu4225;
    }

    public void setPlu4225(double plu4225) {
        this.plu4225 = plu4225;
    }

    public double getPlu4770() {
        return plu4770;
    }

    public void setPlu4770(double plu4770) {
        this.plu4770 = plu4770;
    }

    public double getTotalBags() {
        return totalBags;
    }

    public void setTotalBags(double totalBags) {
        this.totalBags = totalBags;
    }

    public double getSmallBags() {
        return smallBags;
    }

    public void setSmallBags(double smallBags) {
        this.smallBags = smallBags;
    }

    public double getLargeBags() {
        return largeBags;
    }

    public void setLargeBags(double largeBags) {
        this.largeBags = largeBags;
    }

    public double getxLargeBags() {
        return xLargeBags;
    }

    public void setxLargeBags(double xLargeBags) {
        this.xLargeBags = xLargeBags;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
