public class Shoes extends Products{
    private double shoeSize;
    private String shoeColor;


    public Shoes(double shoeSize, String shoeColor, double price, String category){
        super(price,category);
        shoeSize = shoeSize;
        shoeColor = shoeColor;
        
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




