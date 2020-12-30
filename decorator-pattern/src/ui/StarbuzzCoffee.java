package ui;

import domain.*;

public class StarbuzzCoffee {

    public StarbuzzCoffee() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " €" + beverage.cost());

        Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage2.getDescription() + " €" + beverage2.cost());


    }

    public static void main(String[] args) {
        StarbuzzCoffee starbuzzCoffee = new StarbuzzCoffee();

    }
}
