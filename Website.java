import java.util.ArrayList;
import java.util.Scanner;

public class Website{
    private static ArrayList<Order>  orders = new ArrayList<>();
    private static ArrayList<Products> products = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        makeProducts();
        int ans = -1;
        while(ans!=0){
            System.out.println("1. Add to Order");
            System.out.println("2. Edit Order");
            System.out.println("3. List Orders");
            System.out.println("4. Search for Order");
            System.out.println("0. Exit");
            System.out.println("Enter Choice:");
            ans = sc.nextInt();
            sc.nextLine();

            switch(ans){
                case 1:
                System.out.println("Order ID: ");
                int orderID = sc.nextInt();
                

                System.out.println("Month that the Order was placed in number form: ");
                sc.nextInt();
                String orderDate = sc.nextLine();
                int orderNumProducts = orders.size();
                Order o = new Order(orderID, orderNumProducts,orderDate);
                orders.add(o);
                break;

                case 2:
                System.out.println("Edit Order");
                for (int i =0; i<orders.size(); i++){
                    System.out.println(i+" "+orders.get(i));
                }

                int a = -1;
                while(ans != 0){
                    System.out.println("1. Add to Order");
                    System.out.println("2. Remove an Item");
                    System.out.println("3. Cancel Order");
                    sc.nextInt();
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

                        break;

                        case 2:
                        System.out.println("Remove Item");

                        break;

                        case 3:
                        System.out.println("Cancel Order");
                        //e.setStatus("Cancelled");
                        break;


                    }

                    //Order o = orders.get(or);
                }

                break;

                case 3:
                System.out.println("List Orders");

                break;

                case 4:
                System.out.println("Search for Order");

                break;

            }
        }
    }


    public static void makeProducts(){
        products.add(new Shirts("M","blue",24.99,"Shirt"));
        products.add(new Shirts("L","green",18.99,"Shirt"));
        products.add(new Shoes(8.5,"black",44.99,"Shoe"));
        products.add(new Shoes(10,"grey",99.99,"Shoe"));
    }

//     public static ArrayList<Food> getDishes(){
//         ArrayList<Food>  dishes =new ArrayList<>();
//         int ans = 1;
//         while(ans !=0){
//             for(int i = 0; i < menu.size();i++){
//                 System.out.println(i+1+" "+menu.get(i));
//             }
//             System.out.println("Enter Choice (-1 to exit): ");
//             ans = sc.nextInt();
//             sc.nextLine();
//             if(ans > 0 && ans <=menu.size()){
//                 dishes.add(menu.get(ans));
//             }
//             else if(ans== -1){
//                 break;
//             }else{
//                 System.out.println("Invalid choice");
//             }
//         }
//         return dishes;
//     }
//    }

}