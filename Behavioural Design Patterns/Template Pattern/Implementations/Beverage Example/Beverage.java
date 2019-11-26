public abstract class Beverage {

    // template method
    public final void prepareRecipie() {
        boilWater();
        makeBeverage();
        pourInCup();
        addCondiments();
    }

    // other methods
    public void boilWater() {
        System.out.println("Boiling water!");
    }

    public abstract void makeBeverage();

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }

    public abstract void addCondiments();

}