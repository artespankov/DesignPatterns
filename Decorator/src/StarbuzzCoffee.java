import Components.Beverage;
import Components.DarkRoast;
import Components.Espresso;
import Components.HouseBlend;
import Decorators.Mocha;
import Decorators.Whip;
import Decorators.Soy;

public class StarbuzzCoffee {
    public static void main (String[] args){
        Beverage morning_coffee = new Espresso();
        System.out.println(morning_coffee.getDescription() + " $" + morning_coffee.cost());

        Beverage noon_coffee = new DarkRoast();
        noon_coffee = new Mocha(noon_coffee);
        noon_coffee = new Mocha(noon_coffee);
        noon_coffee = new Whip(noon_coffee);
        System.out.println(noon_coffee.getDescription() + " $" + noon_coffee.cost());

        Beverage afternoon_coffee = new HouseBlend();
        afternoon_coffee = new Soy(afternoon_coffee);
        afternoon_coffee = new Mocha(afternoon_coffee);
        afternoon_coffee = new Whip(afternoon_coffee);
        System.out.println(afternoon_coffee.getDescription() + " $" + afternoon_coffee.cost());

    }
}
