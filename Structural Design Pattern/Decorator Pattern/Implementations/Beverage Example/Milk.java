public class Milk extends CondimentDecorator {

    private static final float MILK_COST = 10.5F;

    public Milk(Beverage beverage) {
        super.beverage = beverage;
    }

    @Override
    public float cost() {
        return MILK_COST + beverage.cost();
    }

}