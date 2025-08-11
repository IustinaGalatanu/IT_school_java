package org.example.Homework.session20;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of products with attributes: name, category, and price; find the category with the highest average price.
public class Products {
    public static void main(String[] args) {
        List<Product> produse = Arrays.asList(new Product("Paine", "panificatie", 5.99), new Product("Lapte", "lactate", 9.99),new Product("Covrig","panificatie",3.50),new Product("Branza","lactate",22.15));


        Map<String, Double> highestPrice = produse.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));
        String category=highestPrice.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(category);

    }
}
class Product{
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
