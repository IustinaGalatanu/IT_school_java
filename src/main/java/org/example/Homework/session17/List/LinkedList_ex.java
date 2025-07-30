package org.example.Homework.session17.List;

//1.Write a Java program to append the specified element to the end of a linked list.
// 2.Write a Java program to iterate through all elements in a linked list.
// 3.Write a Java program to iterate through all elements in a linked list starting at
// the specified position.
// 4.Write a Java program to iterate a linked list in reverse order.
// 5.Write a Java program to insert the specified element at the specified position in
// the linked list.
// 6.Write a Java program to insert elements into the linked list at the first and last position.
// 7.Write a Java program to insert the specified element at the front of a linked list.
// 8.Write a Java program to insert the specified element at the end of a linked list.
// 9.Write a Java program to insert some elements at the specified position into a linked list.
// 10.Write a Java program to get the first and last occurrence of the specified elements in a
// linked list.
// 11.Write a Java program to display the elements and their positions in a linked list.
// 12.Write a Java program to remove a specified element from a linked list.
// 13.Write a Java program to remove first and last element from a linked list.
//14.Write a Java program to remove all the elements from a linked list.
//15.Write a Java program of swap two elements in a linked list.
//16.Write a Java program to shuffle the elements in a linked list.
//17.Write a Java program to join two linked lists.
//18.Write a Java program to clone an linked list to another linked list.
//19.Write a Java program to remove and return the first element of a linked list.
//20.Write a Java program to retrieve but does not remove, the first element of a linked list.

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_ex {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        //1
        numbers.addLast(5);
        System.out.println(numbers);
        System.out.println();
        //2
        for(Integer value:numbers){
            System.out.println("numarul este "+value);
        }
        System.out.println();
        //3
        int index=1;
        for(int i=index;i<numbers.size();i++){
            System.out.println("numarul de la indexul "+i+" este "+ numbers.get(i));
        }
        System.out.println();
        //4
        for(int i=numbers.size()-1; i>=0;i--){
            System.out.println("numarul de la indexul "+i+" este "+ numbers.get(i));
        }
        System.out.println();
        //5
        numbers.add(2,7);
        System.out.println(numbers);
        System.out.println();
        //6
        numbers.addFirst(8);
        numbers.addLast(9);
        System.out.println(numbers);
        System.out.println();
        //7
        numbers.addFirst(10);
        System.out.println(numbers);
        System.out.println();
        //8
        numbers.addLast(11);
        System.out.println(numbers);
        System.out.println();
        //9
        numbers.add(1,12);
        numbers.add(3,22);
        numbers.add(5,12);
        System.out.println(numbers);
        System.out.println();
        //10
        int search=12;
        int firstIndex=numbers.indexOf(12);
        int lastIndex=numbers.lastIndexOf(12);
        System.out.println("Numarul "+search+" se gaseste la indexul "+ firstIndex+" si la indexul "+lastIndex);
        System.out.println();
        //11
        for(int i=0;i<=numbers.size()-1;i++){
            System.out.println("numarul de la indexul "+i+" este "+ numbers.get(i));
        }
        System.out.println();
        //12
        numbers.remove(2);
        System.out.println(numbers);
        System.out.println();
        //13
        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
        System.out.println();
        //14
        LinkedList<Integer> numbersCopy=new LinkedList<>(numbers);
        System.out.println(numbersCopy);
        numbersCopy.clear();
        System.out.println(numbersCopy);
        System.out.println();
        //15
        Collections.swap(numbers,2,3);
        System.out.println(numbers);
        System.out.println();
        //16
        Collections.shuffle(numbers);
        System.out.println(numbers);
        System.out.println();
        //17
        numbersCopy.add(67);
        numbersCopy.add(88);
        LinkedList<Integer> join = new LinkedList<>(numbers);
        join.addAll(numbersCopy);
        System.out.println(join);
        System.out.println();
        //18
        LinkedList<Integer> clone = new LinkedList<>(numbers);
        System.out.println(clone);
        System.out.println();
        //19
        clone.getFirst();
        clone.removeFirst();
        System.out.println(clone);
        System.out.println();
        //20
        numbers.peekFirst();
        System.out.println(numbers);






    }
}
