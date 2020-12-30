package domain;

import domain.Beverage;

// we moeten uitwisselbaar blijven met domain.Beverage, dus erven we van klasse domain.Beverage
public abstract class CondimentDecorator extends Beverage{
    private final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    protected Beverage getBeverage() {
        return beverage;
    }

    public abstract String getDescription();

}
