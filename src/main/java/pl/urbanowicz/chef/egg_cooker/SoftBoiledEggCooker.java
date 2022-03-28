package pl.urbanowicz.chef.egg_cooker;

public class SoftBoiledEggCooker implements EggCooker {
    @Override
    public void cook() {
        System.out.println("I'm cooking soft-boiled eggs!");
    }
}
