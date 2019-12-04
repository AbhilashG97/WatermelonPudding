public class Main {
    public static void main(String[] args) {
        // Creating DarkRoast with Soy Milk and Double Mocha
        Beverage beverageOne = new DarkRoast();
        beverageOne = new SoyMilk(beverageOne);
        beverageOne = new Mocha(beverageOne);
        beverageOne = new Mocha(beverageOne);
        System.out.println("Order: " + beverageOne.getDescription() + "\nCost: " + beverageOne.cost());

        System.out.println();

        // Creating HouseBlend with Mocha
        Beverage beverageTwo = new HouseBlend();
        beverageTwo = new Mocha(beverageTwo);
        System.out.println("Order: " + beverageTwo.getDescription() + "\nCost: " + beverageTwo.cost());
    }
}