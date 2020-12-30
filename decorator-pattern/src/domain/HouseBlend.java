package domain;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        setDescription("HouseBlend");
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
