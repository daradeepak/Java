package com.collections;

import java.util.*;

public class Main2 
{
    public static void main(String[] args) 
    {
        // Using HashSet
        Set<Student> al = new HashSet<Student>();
        Student s1 = new Student(10, "abc");
        Student s2 = new Student(11, "def");
        Student s3 = new Student(12, "ghi");
        Student s4 = new Student(13, "jkl");
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        System.out.println("I am HashSet output: ");
        System.out.println(al);

        // Using LinkedHashSet
        System.out.println("I am LinkedHashSet output: ");
        Set<Student> set = new LinkedHashSet<Student>();
        set.addAll(al);
        System.out.println(set);

        // Using TreeSet with custom Comparator for sorting by name
        System.out.println("I am TreeSet output (sorted by name): ");
        Set<Student> tree = new TreeSet<Student>(new SortByName());
        tree.addAll(al);
        System.out.println(tree);

        // Using ArrayList and HashSet for integers
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(12);
        al2.add(13);
        al2.add(12);
        al2.add(11);
        System.out.println(al2);

        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(al2);
        System.out.println(set2);

        // Using TreeSet and HashSet for integers from array
        int[] arr = {12, 13, 12, 11}; 
        Set<Integer> al3 = new TreeSet<>();
        for(int temp : arr)
            al3.add(temp);
        System.out.println(al3);

        Set<Integer> set3 = new HashSet<>(al3);
        System.out.println(set3);
        
    }
}

class Student
{
    int roll;
    String name;

    public Student(int roll, String name)
    {
        this.roll = roll;
        this.name = name;
    }
    
    @Override
    public String toString() 
    {
        return "Student [roll=" + roll + ", name=" + name + "]";
    }
}

class SortByName implements Comparator<Student>
{
    public int compare(Student o1, Student o2)
    {
        return(o1.name).compareTo(o2.name);
    }
}

class SortByRoll implements Comparator<Student>
{
    public int compare(Student o1, Student o2)
    {
        return Integer.compare(o1.roll, o2.roll);
    }
}
