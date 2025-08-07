package org.example.Homework.session19.session19;

//Create a functional interface with a method that takes two strings as input and returns an integer. Implement this interface using a lambda expression to create a custom comparator that compares strings based on their length (not lexicographically).
public class Return {
    public static void main(String[] args) {

        StrComparator length=(s1, s2)-> Integer.compare(s1.length(),s2.length());
        int lungime= length.compare("Ana","George");
        System.out.println(lungime);

    }
}
@FunctionalInterface
interface StrComparator {
    int compare(String s1, String s2);
}

