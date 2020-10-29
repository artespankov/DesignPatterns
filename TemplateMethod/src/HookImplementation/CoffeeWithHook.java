package HookImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    void brew() {
        System.out.println("Dripping Beverage.Coffee through filter");
    }

    // Reload hook
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO ");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
