package org.example.Homework.session20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

//Given a list of employee objects with attributes: name, department, and salary; find the department with the highest total salary.
public class Employee {
    public static void main(String[] args) {
        List<Employees> peoples= Arrays.asList(new Employees("Iustina", "Software Development",3000), new Employees("Andreea", "QA",1500) );
       Map<String,Integer> highest=peoples.stream()
                .collect(Collectors.groupingBy(Employees::getDepartament,Collectors.summingInt(Employees::getSalary)));
       String topDepartment = highest.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(topDepartment);

    }
}
class Employees{
    private String name;
    private String departament;
    private int salary;

    public Employees(String name, String departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }
}
