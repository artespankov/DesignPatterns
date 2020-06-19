package PizzaStores;

import PizzaTypes.ClamPizza;
import PizzaTypes.PepperoniPizza;
import PizzaTypes.Pizza;
import PizzaTypes.VeggiePizza;

public class CLPizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        return switch(type){
            case "veggie" -> new VeggiePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            default -> null;
        };
    }
}
