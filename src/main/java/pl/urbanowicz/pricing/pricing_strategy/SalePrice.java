package pl.urbanowicz.pricing.pricing_strategy;

public class SalePrice implements PricingStrategy {

    @Override
    public void calculatePrice(int price, boolean isSignedForNewsletter) {
        if (isSignedForNewsletter) {
            System.out.println("Sale: " + price / 2 + "zł");
        } else {
            System.out.println("User is not assign to the newsletter. The strategy was chosen wrongly");
        }
    }
}
