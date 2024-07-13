package com.collections;

import java.util.*;

public class UniqueElementsSet 
{
    public static void main(String[] args) 
    {
//        int a[] = {10,20,30,40,10,20}; 
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        HashSet<Integer> set = new HashSet<Integer>();
//        
//        for(int x=0; x<al.size(); x++)
//        {
//        	if(al.indexOf(al.get(x)) != al.lastIndexOf(al.get(x)))
//        	{
//        		System.out.println(al.get(x));
//        	}
//        }
//        System.out.println(set);
    	
    	        int a[] = {10, 20, 30, 40, 10, 20}; 
    	        ArrayList<Integer> al = new ArrayList<Integer>();
    	        Set<Integer> set = new HashSet<Integer>();
    	        
    	        for (int temp : a) {
    	            al.add(temp);
    	            set.add(temp);
    	        }
    	        
    	        System.out.println("ArrayList: " + al);
    	        System.out.println("Unique elements in Set: " + set);

    }
}

