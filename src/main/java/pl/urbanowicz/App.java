package pl.urbanowicz;

import pl.urbanowicz.chef.Chef;
import pl.urbanowicz.chef.egg_cooker.HardBoiledEggCooker;
import pl.urbanowicz.chef.egg_cooker.SoftBoiledEggCooker;
import pl.urbanowicz.pricing.PriceCalculator;
import pl.urbanowicz.pricing.pricing_strategy.RegularPrice;
import pl.urbanowicz.pricing.pricing_strategy.SalePrice;

public class App {
    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        //Użytkownik nie jest zapisany do newslettera - normalna cena
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, false);
        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, true);
        //Użytkownik jest zapisany do newslettera
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, true);
        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);

        Chef chef = new Chef("Gordon Ramsey");
        //new order - hard-boiled eggs
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        // new order - soft-boiled eggs
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
