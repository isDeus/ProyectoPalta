package Logico;

public class Palta {

    private String date;
    private String averagePrice;
    private String totalVolume;
    private String plu4046;
    private String plu4225;
    private String plu4770;
    private String totalBags;
    private String smallBags;
    private String largeBags;
    private String xLargeBags;
    private String type;
    private String year;
    private String region;

    public Palta (String date, String averagePrice, String totalVolume, String plu4046, String plu4225, String plu4770, String totalBags, String smallBags, String largeBags, String xLargeBags,  String type, String year, String region){
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
        this.year = type;
        this.region = region;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(String averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(String totalVolume) {
        this.totalVolume = totalVolume;
    }

    public String getPlu4046() {
        return plu4046;
    }

    public void setPlu4046(String plu4046) {
        this.plu4046 = plu4046;
    }

    public String getPlu4225() {
        return plu4225;
    }

    public void setPlu4225(String plu4225) {
        this.plu4225 = plu4225;
    }

    public String getPlu4770() {
        return plu4770;
    }

    public void setPlu4770(String plu4770) {
        this.plu4770 = plu4770;
    }

    public String getTotalBags() {
        return totalBags;
    }

    public void setTotalBags(String totalBags) {
        this.totalBags = totalBags;
    }

    public String getSmallBags() {
        return smallBags;
    }

    public void setSmallBags(String smallBags) {
        this.smallBags = smallBags;
    }

    public String getLargeBags() {
        return largeBags;
    }

    public void setLargeBags(String largeBags) {
        this.largeBags = largeBags;
    }

    public String getxLargeBags() {
        return xLargeBags;
    }

    public void setxLargeBags(String xLargeBags) {
        this.xLargeBags = xLargeBags;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
