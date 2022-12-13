import java.util.ArrayList;

public class Order {
    private int orderID;
    private ArrayList<Product> products;
    private String dateOrders;   

    public Order(int orderID,String dateOrders) {
        this.orderID = orderID;
        products = new ArrayList<>();
        this.dateOrders = dateOrders;
    }


    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getDateOrders() {
        return dateOrders;
    }

    public void setDateOrders(String dateOrders) {
        this.dateOrders = dateOrders;
    }

    public void add(Product p){
        products.add(p);
    }

    public ArrayList<Product> getProducts(){
        return products;
    }

    public String toString(){
        return "Order ID: "+orderID+" Order Date: "+dateOrders;
    }


    
}
