import java.util.ArrayList;
import java.util.Scanner;

public class Website{
    private static ArrayList<Order>  orders = new ArrayList<>();
    private static ArrayList<Product> products = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        makeProducts();
        int ans = -1;
        while(ans!=0){
            System.out.println("1. Place Order");
            System.out.println("2. Edit Order");
            System.out.println("3. List Orders");
            System.out.println("4. Cancel Order");
            System.out.println("0. Exit");
            System.out.println("Enter Choice:");
            ans = sc.nextInt();
            sc.nextLine();

            switch(ans){
                case 1:
                System.out.println("Order ID: ");
                int orderID = sc.nextInt();
                sc.nextLine();
                

                System.out.println("Month that the Order was placed in number form: ");

                String dateOrders = sc.nextLine();

                Order o = new Order(orderID, dateOrders, products);
                System.out.println("Place Order");
                        for(int i =0; i < products.size(); i++){
                            System.out.println(i  +" "+products.get(i));
                        }
                        int t = sc.nextInt();sc.nextLine();
                        o.add(products.get(t));
                orders.add(o);
                break;

                case 2:
                System.out.println("Edit Order");
               

                int a = -1;
                while(ans != 0){
                    System.out.println("1. Add to Order");
                    System.out.println("2. Remove an Item");
                  
                    a = sc.nextInt();
                    sc.nextLine();

                    for(int i = 0; i<orders.size();i++){
                        System.out.println(i+" "+orders.get(i));
                    }
                    int or = sc.nextInt();
                    sc.nextLine();

                    Order e = orders.get(or);

                    switch(a){
                        case 1:
                        System.out.println("Add to Order");
                        for(int i =0; i < products.size(); i++){
                            System.out.println(i  +" "+products.get(i));
                        }
                        int t_ = sc.nextInt();sc.nextLine();
                        e.add(products.get(t_));
                    
                        
                        break;
                    
                        case 2:
                        System.out.println("Remove Item");
                        ArrayList<Product> oProducts =  e.getProducts();
                        for(int i =0; i < oProducts.size(); i++){
                            System.out.println(i+" "+oProducts.get(i));
                        }
                        int tt = sc.nextInt();sc.nextLine();
                        oProducts.remove(tt);
                        break;

                


                    }
                    break;

                }


                case 3:
                System.out.println("List Orders");
                for (int i =0; i<orders.size(); i++){
                    System.out.println(i+" "+orders.get(i));
                }
                break;

                case 4:
                System.out.println("Cancel");
                for (int i =0; i<orders.size();i++){
                    System.out.println(i+" "+orders.get(i));
                    int w_ = sc.nextInt();
                    sc.nextLine();
                    orders.remove(w_);
                break;

            }
        }
    }
    }


    public static void makeProducts(){
        products.add(new Shirt("M","blue",24.99,"Shirt"));
        products.add(new Shirt("L","green",18.99,"Shirt"));
        products.add(new Shoe(8.5,"black",44.99,"Shoe"));
        products.add(new Shoe(10,"grey",99.99,"Shoe"));
    
    }



}