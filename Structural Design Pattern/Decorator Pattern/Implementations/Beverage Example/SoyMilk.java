public class SoyMilk extends CondimentDecorator {

    private Beverage beverage;
    private static final float MILK_COST = 10.5F;

    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy Milk";
    }

    @Override
    public float cost() {
        return MILK_COST + beverage.cost();
    }
}