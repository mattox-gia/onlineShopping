public class Shirt extends Product{
    private String shirtSize;
    private String shirtColor;


    public Shirt(String shirtSize,String shirtColor,double price, String category){
        super(price,category);
        this.shirtSize = shirtSize;
        this.shirtColor = shirtColor;
      
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

    public double getTotal(){
        return getPrice();
        
    }

    public String toString(){
        return "Size: "+shirtSize+" Color: "+shirtColor+" Price: "+super.getPrice()+" Category: "+super.getCategory();
    }

}