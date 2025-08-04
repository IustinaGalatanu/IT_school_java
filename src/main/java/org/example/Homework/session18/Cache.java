package org.example.Homework.session18;
//Simulate a cache where objects are stored. Objects with the same hashcode should overwrite existing objects in the cache. Consider how would you design the hashcode method to facilitate this.
import java.util.*;

public class Cache {
    private String nume;
    private int age;

    public Cache(int age, String nume) {
        this.age=age;
        this.nume = nume;

    }

    @Override
    public int hashCode() {
        int sum = 0;
        for (char c : nume.toCharArray()) {
            sum = sum + c;

        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cache dog = (Cache) o;
        return Objects.equals(nume, dog.nume);
    }

    @Override
    public String toString() {
        return "Dog{" + " age "+ age+
                " nume ='" + nume + '\'' +
                '}';
    }

}
class Dogs{
    public static void main(String[] args) {
        Map<Cache, String> cache = new HashMap<>();

        Cache c1 = new Cache(5, "Rex");
        Cache c2 = new Cache(3, "Rex");
        Cache c3 = new Cache(2, "Luna");

        cache.put(c1, "First");
        cache.put(c2, "Second");
        cache.put(c3, "Third");

        for (Map.Entry<Cache, String> entry : cache.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


