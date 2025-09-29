package org.example.Homework.session34;

import java.util.HashMap;
import java.util.Map;

interface Pricing {
     double getPrice (Map<String, Double> items);
}

class RegularPrice implements Pricing {

    @Override
    public double getPrice(Map<String, Double> items) {
        return items.values().stream().mapToDouble(Double::doubleValue).sum();
    }
}

class DiscountPrice implements Pricing {

    @Override
    public double getPrice(Map<String, Double> items) {
        return items.values().stream().mapToDouble(Double::doubleValue).sum()*0.8;
    }
}

class HolidayPrice implements Pricing {

    @Override
    public double getPrice(Map<String, Double> items) {
        return items.values().stream().mapToDouble(Double::doubleValue).sum()*0.7;
    }
}
class ShoppingCart {
    private Map<String, Double> items = new HashMap<>();
    private Pricing pricingStrategy;

    public void addItem(String name, double price) {
        items.put(name, price);
    }

    public void setPricingStrategy(Pricing pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double checkout() {
        if (pricingStrategy == null) {
            throw new IllegalStateException("Pricing strategy not set!");
        }
        return pricingStrategy.getPrice(items);
    }
}

public class ShoppingStrategy {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 1000);
        cart.addItem("Mouse", 50);
        cart.addItem("Keyboard", 100);

        cart.setPricingStrategy(new RegularPrice());
        System.out.println("Regular total: " + cart.checkout());

        cart.setPricingStrategy(new DiscountPrice());
        System.out.println("Discount total: " + cart.checkout());

        cart.setPricingStrategy(new HolidayPrice());
        System.out.println("Holiday total: " + cart.checkout());


    }
}
