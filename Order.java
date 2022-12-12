public class Order {
    private int orderID;
    private int orderNumProducts;
    private String dateOrders;   

    public Order(int orderID, int orderNumProducts, String dateOrders) {
        this.orderID = orderID;
        this.orderNumProducts = orderNumProducts;
        this.dateOrders = dateOrders;
    }


    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getOrderNumProducts() {
        return orderNumProducts;
    }

    public void setOrderNumProducts(int orderNumProducts) {
        this.orderNumProducts = orderNumProducts;
    }

    public String getDateOrders() {
        return dateOrders;
    }

    public void setDateOrders(String dateOrders) {
        this.dateOrders = dateOrders;
    }



    
}
