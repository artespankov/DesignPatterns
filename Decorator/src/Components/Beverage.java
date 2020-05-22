package Components;

public abstract class Beverage {
    String description = "Unknown Components.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
