package org.example.Homework.session18;

import org.example.Session18.Book;

import java.util.HashMap;
import java.util.Map;

//Create a class Pair which can hold a pair of objects, the objects can be of any type.
public class Pair<K,V>{
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
class Pairs{
    public static void main(String[] args) {
        Map<String, Integer> pairs= new HashMap<>();
        pairs.put("Ion",30);
        pairs.put("Andrei",28);

        System.out.println(pairs);
    }
}
