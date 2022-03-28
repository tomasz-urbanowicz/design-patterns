package pl.urbanowicz.pricing.pricing_strategy;

public interface PricingStrategy {
    void calculatePrice(int price, boolean isSignedForNewsletter);
}