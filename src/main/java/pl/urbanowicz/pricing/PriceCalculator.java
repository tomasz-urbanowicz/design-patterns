package pl.urbanowicz.pricing;

import pl.urbanowicz.pricing.pricing_strategy.PricingStrategy;

public class PriceCalculator {

    private PricingStrategy pricingStrategy;

    public void calculate(int price, boolean isSignedForNewsletter) {
        this.pricingStrategy.calculatePrice(price, isSignedForNewsletter);
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}

