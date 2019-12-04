public class HouseBlend extends Beverage {

    private static final float HOUSEBLEND_COST = 150.0F;

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public float cost() {
        return HOUSEBLEND_COST;
    }
}