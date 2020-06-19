import PizzaStores.CHPizzaStore;
import PizzaStores.NYPizzaStore;
import PizzaStores.PizzaStore;
import PizzaTypes.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chStore = new CHPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ellie ordered a " + pizza.getName() + "\n");

        pizza = chStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
