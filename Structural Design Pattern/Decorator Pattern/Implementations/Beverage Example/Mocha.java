public class Mocha extends CondimentDecorator {

    private static final float CHOCOLATE_COST = 10.5F;
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        return CHOCOLATE_COST + beverage.cost();
    }
}
