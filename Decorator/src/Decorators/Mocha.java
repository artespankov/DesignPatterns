package Decorators;

import Components.Beverage;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    double cost;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.cost = 0.2;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + this.cost;
    }
}
