public class Shirts extends Products{
    private String shirtSize;
    private String shirtColor;
    private double shirtPrice;

    public Shirts(String shirtSize,String shirtColor,double shirtPrice){
        shirtSize = shirtSize;
        shirtColor = shirtColor;
        shirtPrice = shirtPrice;
    }

    public String getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    public String getShirtColor() {
        return shirtColor;
    }

    public void setShirtColor(String shirtColor) {
        this.shirtColor = shirtColor;
    }

    public double getShirtPrice() {
        return shirtPrice;
    }

    public void setShirtPrice(double shirtPrice) {
        this.shirtPrice = shirtPrice;
    }

    public String toString(){
        return "x";
    }

}