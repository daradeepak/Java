package com.collections;
import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
//		Queue q = new PriorityQueue();
//		q.add("Hello");
//		q.add("World");
//		System.out.println(q);
		
//		List l = new Vector();
//		l.add("Hey");
//		l.add("How are you ?");
//		l.add(123);
//		System.out.println(l.get(0));
//		System.out.println(l.indexOf(123));
//		System.out.println(l.lastIndexOf("How are you ?"));
//		System.out.println(l.remove(2));
//		System.out.println(l);
		
//		Set s  = new HashSet();
//		s.add("World");
//		s.add("Hello");
//		s.add("Dara");
//		s.add("Deepak");
//		s.add("Password");
//
//		s.add(true);
//		System.out.println(s);
//        for (Object obj : s) {
//            System.out.println(obj + " : "+obj.hashCode());
//        }
		
		List l = new ArrayList();
		l.add("Hi");
		l.add("good");
		l.add("morning");
		l.add(123);
		
		System.out.println("For Loop: ");
		for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("For-each Loop: ");
		for(Object obj: l)
			System.out.println(obj);



	}

}
