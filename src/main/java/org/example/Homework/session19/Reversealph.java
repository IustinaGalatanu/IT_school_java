package org.example.Homework.session19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//You are given a List<String> representing a list of words. Create a lambda expression to sort the list in alphabetical order. Next, modify your lambda expression to sort the list in reverse alphabetical order.
public class Reversealph {
    public static void main(String[] args) {
        List<String> nume= Arrays.asList("Ana", "George","Bianca", "Andrei");
        List<String> copyNume=nume;
        Comparator<String> alph=(n1, n2)->n1.compareTo(n2);
        nume.sort(alph);
        System.out.println("Numele in ordine alfabetica: "+nume);

        Comparator<String> reverse=(n1, n2)->n2.compareTo(n1);
        copyNume.sort(reverse);
        System.out.println("Numele in ordine inversa alfabetica: "+copyNume);

    }
}
