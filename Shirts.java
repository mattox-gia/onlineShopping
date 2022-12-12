public class Shirts extends Products{
    private String shirtSize;
    private String shirtColor;


    public Shirts(String shirtSize,String shirtColor,double price, String category){
        super(price,category);
        shirtSize = shirtSize;
        shirtColor = shirtColor;
      
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