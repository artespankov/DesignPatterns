package PizzaStores;
import PizzaTypes.*;

public class NYPizzaStore extends PizzaStore{

    public Pizza createPizza(String type){
        return switch (type){
            case "cheese" -> new NYCheesePizza();
//            case "veggie" -> new VeggiePizza();
//            case "clam" -> new ClamPizza();
//            case "pepperoni" -> new PepperoniPizza();
            default -> null;
        };
    }
}
