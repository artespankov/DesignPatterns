package Ingredients;

import Factories.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

//    public Sauce createSauce() {
//        return MarinaraSauce();
//    }

//    public Cheese createCheese() {
//        return new ReggianoCheese();
//    }

//    public Veggies[] createVeggies() {
//        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom() };
//        return veggies;
//    }

//    public Pepperoni createPepperoni() {
//        return new SlicedPepperoni();
//    }
//
//    public Clams createClam() {
//        return new FreshClams();
//    }
}
