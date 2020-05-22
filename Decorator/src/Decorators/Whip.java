package Decorators;

import Components.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    double cost;

    public Whip(Beverage beverage){
        this.beverage = beverage;
        this.cost = 0.1;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + this.cost;
    }
}
