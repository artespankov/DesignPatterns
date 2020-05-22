package Components;

import Components.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Components.Decaf coffee";
    }

    public double cost(){
       return 1.05;
    }
}
