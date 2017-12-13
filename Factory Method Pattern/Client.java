import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        SweetFactory sweetFactory = new SweetFactory();
        DietFactory dietFactory = new DietFactory();

        Product product1 = sweetFactory.getProduct(scanner.nextLine()); 
        Product product2 = dietFactory.getProduct(scanner.nextLine());    

        product1.edibleItem();
        product2.edibleItem();

        scanner.close();
    }
}