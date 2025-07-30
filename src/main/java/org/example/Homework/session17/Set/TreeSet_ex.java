package org.example.Homework.session17.Set;

import java.util.Iterator;
import java.util.TreeSet;

//1.Write a Java program to create a new tree set, add some colors (string) and print
// out the tree set.
//2.Write a Java program to iterate through all elements in a tree set.
//3.Write a Java program to add all the elements of a specified tree set to another tree set.
//4.Write a Java program to create a reverse order view of the elements contained in a given
// tree set.
//5.Write a Java program to get the first and last elements in a tree set.
//6.Write a Java program to clone a tree set list to another tree set.
//7.Write a Java program to get the number of elements in a tree set.
//8.Write a Java program to compare two tree sets.
//9.Write a Java program to find the numbers less than 7 in a tree set.
//10.Write a Java program to get the element in a tree set which is greater than or equal to
// the given element.
//11.Write a Java program to get the element in a tree set which is less than or equal to
// the given element.
//12.Write a Java program to get the element in a tree set which is strictly greater than or
// equal to the given element.
//13.Write a Java program to get an element in a tree set which is strictly less than the
// given element.
//14.Write a Java program to retrieve and remove the first element of a tree set.
//15.Write a Java program to retrieve and remove the last element of a tree set.
//16.Write a Java program to remove a given element from a tree set.
public class TreeSet_ex {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        //1
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        System.out.println(colors);
        System.out.println();
        //2
        for(String color: colors){
            System.out.println("culoarea: "+color);
        }
        System.out.println();
        //3
        TreeSet<String> colorsCopy = new TreeSet<>();
        colorsCopy.addAll(colors);
        System.out.println(colorsCopy);
        System.out.println();
        //4
        Iterator<String> reverseIterator = colorsCopy.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
        System.out.println();
        //5
        System.out.println(colors.first());
        System.out.println(colors.last());
        System.out.println();
        //6
        TreeSet<String> clone= new TreeSet<>(colors);
        System.out.println(clone);
        System.out.println();
        //7
        System.out.println(clone.size());
        System.out.println();
        //8
        for(String color:colors){
            if(clone.contains(color)){
                System.out.println("Culoarea "+color+" se regaseste in ambele seturi");
            }else{
                System.out.println("Culoarea " +color+" nu se regaseste in ambele seturi");
            }
        }
        System.out.println();
        //9
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(1);
        numbers.add(8);
        for(Integer number:numbers){
            if(number<=7){
                System.out.println("numarul "+ number+ " e mai mic ca 7");
            }
        }
        System.out.println();
        //10
        int target=11;
        Integer result=numbers.ceiling(target);
        System.out.println(result);
        System.out.println();
        //11
        int target2=3;
        Integer result2=numbers.floor(target);
        System.out.println(result2);
        System.out.println();
        //12
        Integer result3=numbers.higher(target);
        System.out.println(result3);
        System.out.println();
        //13
        Integer result4=numbers.lower(target2);
        System.out.println(result4);
        System.out.println();
        //14
        numbers.pollFirst();
        System.out.println(numbers);
        //15
        numbers.pollLast();
        System.out.println();
        //16
        Integer num=12;
        numbers.remove(12);
        System.out.println(numbers);

    }
}
