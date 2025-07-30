package org.example.Homework.session17.List;

import java.util.ArrayList;
import java.util.Collections;

//1. Write a Java program to create a new array list, add some colors (string)
// and print out the collection.
//2. Write a Java program to iterate through all elements in a array list.
//3. Write a Java program to insert an element into the array list at the first position.
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//5. Write a Java program to update specific array element by given element.
//6. Write a Java program to remove the third element from a array list.
//7. Write a Java program to search an element in a array list.
//8. Write a Java program to sort a given array list.
//9. Write a Java program to copy one array list into another.
//10. Write a Java program to shuffle elements in a array list.
//11. Write a Java program to reverse elements in a array list.
//12. Write a Java program to extract a portion of a array list.
//13. Write a Java program to compare two array lists.
//14. Write a Java program of swap two elements in an array list.
//15. Write a Java program to join two array lists.
//16. Write a Java program to clone an array list to another array list.
//17. Write a Java program to empty an array list.
//18. Write a Java program to test an array list is empty or not.
//19. Write a Java program to trim the capacity of an array list the current list size.
//20. Write a Java program to increase the size of an array list.


public class ArrayList_ex {
    public static void main(String[] args) {
        //1
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("pink");
        System.out.println(colors);
        System.out.println();
        //2
        for (String color : colors) {
            System.out.println("Color from array: " + color);
        }
        System.out.println();
        //3
        colors.add(0, "green");
        System.out.println(colors);
        System.out.println();
        //4
        System.out.println(colors.get(1));
        System.out.println();
        //5
        colors.set(1, "yellow");
        System.out.println(colors);
        System.out.println();
        //6
        colors.remove(2);
        System.out.println(colors);
        System.out.println();
        //7
        System.out.println(colors.contains("yellow"));
        System.out.println();
        //8
        Collections.sort(colors);
        System.out.println(colors);
        System.out.println();
        //9
        ArrayList<String> colorsCopy = new ArrayList<>();
        colorsCopy.addAll(colors);
        System.out.println(colorsCopy);
        System.out.println();
        //10
        Collections.shuffle(colors);
        System.out.println(colors);
        System.out.println();
        //11
        Collections.reverse(colors);
        System.out.println(colors);
        System.out.println();
        //12
        System.out.println(colors.subList(1, 2));
        System.out.println();
        //13
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("blue");
        colors2.add("pink");
        colors2.add("orange");

        for (String item : colors) {
            if (colors2.contains(item)) {
                System.out.println(item + " este prezent în ambele liste.");
            } else {
                System.out.println(item + " nu este prezent în ambele liste.");
            }

        }
        System.out.println();
        //14
        Collections.swap(colors,1,2);
        System.out.println(colors);
        System.out.println();
        //15
        ArrayList<String> join = new ArrayList<>(colors);
        join.addAll(colors2);
        System.out.println(join);
        System.out.println();
        //16
        ArrayList<String> clone = new ArrayList<>(colors);
        System.out.println(clone);
        System.out.println();
        //17
        colors.clear();
        System.out.println(colors);
        System.out.println();
        //18
        System.out.println(colors.isEmpty());
        System.out.println();
        //19
        ArrayList<String> colors3 = new ArrayList<>(20);
        colors3.add("red");
        colors3.add("green");
        colors3.add("blue");

        colors3.trimToSize();
        System.out.println();
        //20
        colors3.ensureCapacity(10);

    }
}
