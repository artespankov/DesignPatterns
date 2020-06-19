package PizzaStores;
import PizzaTypes.*;

public class CHPizzaStore extends PizzaStore{

    public Pizza createPizza(String type){
        return switch (type){
            case "cheese" -> new CHCheesePizza();
            case "veggie" -> new VeggiePizza();
            case "clam" -> new ClamPizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> null;
        };
    }
}
