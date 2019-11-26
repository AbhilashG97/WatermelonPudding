public class Coffee extends Beverage {
    
    @Override
    public void makeBeverage() {
        System.out.println("Add coffee powder");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add milk and sugar");
    }
}