package Ingredients;

import Factories.PizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

//    public Sauce createSauce() {
//        return PlumTomatoSauce();
//    }
//
//    public Cheese createCheese() {
//        return new MozarellaCheese();
//    }
//
//    public Veggies[] createVeggies() {
//        Veggies veggies[] = { new Spinach(), new BlackOlives(), new EggPlant() };
//        return veggies;
//    }
//
//    public Pepperoni createPepperoni() {
//        return new SlicedPepperoni();
//    }
//
//    public Clams createClam() {
//        return new FrozenClams();
//    }
}
