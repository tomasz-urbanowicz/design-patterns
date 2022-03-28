package pl.urbanowicz.chef;

import pl.urbanowicz.chef.egg_cooker.EggCooker;

public class Chef {
    private String name;
    private EggCooker eggCooker;

    public Chef(String name) {
        this.name = name;
    }

    public void cook() {
        this.eggCooker.cook();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }
}
