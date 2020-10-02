package PizzaTypes;

public class CHCheesePizza extends Pizza {
    public CHCheesePizza() {
        name = "Chicago Deep Dish Cheese Pizza";
//        dough = "Extra Thick Crust Dough";

    }

    public void prepare() {

    }

    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
