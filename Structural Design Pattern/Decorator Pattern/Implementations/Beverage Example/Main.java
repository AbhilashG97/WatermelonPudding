public class Main {
    public static void main(String[] args) {
        // Add milk and chocolate

        System.out.println(new Chocolate(new Milk(new HouseBlend("House blend coffee"))).cost());
    }
}