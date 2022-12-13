public class Shoe extends Product{
    private double shoeSize;
    private String shoeColor;


    public Shoe(double shoeSize, String shoeColor, double price, String category){
        super(price,category);
        this.shoeSize = shoeSize;
        this.shoeColor = shoeColor;
        
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

    public double getTotal(){
        return getPrice();
        
    }
    
    public String toString(){
        return "Size: "+shoeSize+" Color: "+shoeColor+" Price: "+super.getPrice()+" Category: "+super.getCategory();
        }
    }




