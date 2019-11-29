public class DarkRoast extends Beverage {

    private static final float DARKROAST_COST = 250.0F;

    public DarkRoast(String description) {
        setDescription(description);
    }

    @Override
    public float cost() {
        return DARKROAST_COST;
    }

}