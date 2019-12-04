public abstract class Beverage {

    // template method
    public final void prepareRecipie() {
        boilWater();
        makeBeverage();
        pourInCup();
        if (hasCondiments()) {
            addCondiments();
        }
    }

    // other methods
    public void boilWater() {
        System.out.println("Boiling water!");
    }

    public abstract void makeBeverage();

    public void pourInCup() {
        System.out.println("Pouring in cup");
    }

    /**
     * This is a hook() method which may or may not be 
     * implemented by classes.
     * @return boolean tells whether condiments need to be added or not.
     */
    public boolean hasCondiments() {
        return true;
    }

    public abstract void addCondiments();

}