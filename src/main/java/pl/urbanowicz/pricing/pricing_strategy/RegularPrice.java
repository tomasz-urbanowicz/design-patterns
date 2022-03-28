package pl.urbanowicz.pricing.pricing_strategy;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedForNewsletter) {
        if (!isSignedForNewsletter) {
            System.out.println("Normal price: " + price + "zł");
        } else {
            System.out.println("User is not assign to the newsletter. The strategy was chosen wrongly");
        }
    }
}
