package org.example.Homework.session18;

import java.util.Objects;

//Create a Product class with name, price, and id fields. Implement the equals() method to check only the id field. Implement the hashCode() method to use the id field to calculate the hash code. Test that two instances with the same id return true for equals() and have the same hash code. Then change the id of one instance and test that they are no longer equal and have different hash codes.
public class Product {
    private String name;
    private double price;
    private String idFields;

    public Product(String name, double price, String idFields) {
        this.name = name;
        this.price = price;
        this.idFields = idFields;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(idFields, product.idFields);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idFields);
    }
}

class Products{
    public static void main(String[] args) {

        Product product1= new Product("Banana",2.99,"123");
        Product product2=new Product("Capsuni",1.99,"123");
        Product product3= new Product("Struguri", 2.43,"222");

        System.out.println("product1 equals product2 "+product1.equals(product2));
        System.out.println("product2 equals product3 "+product2.equals(product3));


        System.out.println("hashcode for prod 1 "+ product1.hashCode());
        System.out.println("hashcode for prod 2 "+ product2.hashCode());
        System.out.println("hashcode for prod 3 "+ product3.hashCode());
    }
}
