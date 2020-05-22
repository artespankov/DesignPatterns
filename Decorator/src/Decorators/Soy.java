package Decorators;

import Components.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;
    double cost;

    public Soy(Beverage beverage){
        this.beverage = beverage;
        this.cost = 0.15;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + this.cost;
    }
}
