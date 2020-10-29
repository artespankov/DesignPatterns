package HookImplementation;

public abstract class CaffeineBeverageWithHook {


    //    Template method
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    // Hook
    boolean customerWantsCondiments(){
        return true;
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
    abstract void addCondiments();
    abstract void brew();

}
