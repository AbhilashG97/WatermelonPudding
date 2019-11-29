public class Chocolate extends CondimentDecorator {

    private static final float CHOCOLATE_COST = 10.5F;

    public Chocolate(Beverage beverage) {
        super.beverage = beverage;
    }

    @Override
    public float cost() {
        return CHOCOLATE_COST + beverage.cost();
    }

}