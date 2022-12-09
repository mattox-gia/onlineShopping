public class Shoes extends Products{
    private double shoeSize;
    private String shoeColor;
    private double shoePrice;

    public Shoes(double shoeSize, String shoeColor, double shoePrice){
        shoeSize = shoeSize;
        shoeColor = shoeColor;
        shoePrice = shoePrice;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public String getShoeColor() {
        return shoeColor;
    }

    public void setShoeColor(String shoeColor) {
        this.shoeColor = shoeColor;
    }

    public double getShoePrice() {
        return shoePrice;
    }

    public void setShoePrice(double shoePrice) {
        this.shoePrice = shoePrice;
    }

    public String toString(){
        return "x";
    }

}


