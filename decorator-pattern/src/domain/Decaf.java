package domain;

public class Decaf extends Beverage{
    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
