package ClassicImplementation;

public abstract class CaffeineBeverage {

    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    abstract void addCondiments();
    abstract void brew();

    //    Template method
    final void prepareRecipe() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

}
