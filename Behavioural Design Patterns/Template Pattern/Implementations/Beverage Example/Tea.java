public class Tea extends Beverage {

    @Override
    public void makeBeverage() {
        System.out.println("Add tea tag");
    }

    @Override
    public void addCondiments() {
        System.out.println("Add sugar");
    } 
}