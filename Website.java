import java.util.ArrayList;
import java.util.Scanner;

public class Website{
    private static ArrayList<Products> products = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        makeProducts();
        int ans = -1;
        while(ans!=0){
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Exit");
            System.out.println("Enter Choice:");
            ans = sc.nextInt();
            sc.nextLine();

            switch(ans){
                case 1:
                
                break;
                case 2:

                break;
                case 3:

                break;
                case 4:
                
                break;
                case 5:
                
                break;
            }
        }
    }


    public static void makeProducts(){
        products.add(new Shirts());
        products.add(new Shirts());
        products.add(new Shoes());
        products.add(new Shoes());
    }
}