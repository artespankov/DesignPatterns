package HookImplementation;

import ClassicImplementation.CaffeineBeverage;

public class TeaWithHook extends CaffeineBeverageWithHook {

    void addCondiments() {
        System.out.println("Adding Lemon");
    }

    void brew() {
        System.out.println("Steeping the tea");
    }
}
