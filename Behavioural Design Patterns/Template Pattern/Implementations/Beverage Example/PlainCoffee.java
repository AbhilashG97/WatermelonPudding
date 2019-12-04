public class PlainCoffee extends Beverage {
    
    @Override
    public void makeBeverage() {
        System.out.println("Making plain coffee with no condiments.");
    }

    @Override
    public boolean hasCondiments() {
        return false;
    }

    @Override
    public void addCondiments() {
        System.out.println("No condiments");
    }
}