package pl.urbanowicz.chef.egg_cooker;

public class HardBoiledEggCooker implements EggCooker {
    @Override
    public void cook() {
        System.out.println("I'm cooling hard-boiled eggs!");
    }
}
