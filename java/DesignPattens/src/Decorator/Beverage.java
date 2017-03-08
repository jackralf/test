package Decorator;

/**
 * Created by machenfei on 2017/3/8.
 */
public abstract class Beverage {
    String description = "Unknown Berverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
