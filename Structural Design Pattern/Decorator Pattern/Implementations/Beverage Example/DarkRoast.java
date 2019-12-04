public class DarkRoast extends Beverage {

    private static final float DARKROAST_COST = 250.0F;

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public float cost() {
        return DARKROAST_COST;
    }
}