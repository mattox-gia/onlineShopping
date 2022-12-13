public class Order {
    private int orderID;
 
    private String dateOrders;   

    public Order(int orderID,String dateOrders) {
        this.orderID = orderID;
      
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

    public String toString(){
        return "Order ID: "+orderID+" Order Date: "+dateOrders;
    }


    
}
