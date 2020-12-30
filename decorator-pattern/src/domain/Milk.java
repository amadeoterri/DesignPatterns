package domain;

// Milk is een decorator, dus erven we van CondimentDecorator
// CondimentDecorator is een uitbreiding van Beverage
public class Milk extends CondimentDecorator {

    // De beverage die we omwikkelen, dragen we over aan de  constructor
    // van de decorator
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .10 + getBeverage().cost();
    }
}
