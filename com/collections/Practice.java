package com.collections;

import java.util.*;

public class Practice 
{

	public static void main(String[] args)
	{
		//HashSet
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(9);
		hs.add(9);
		hs.add(2);
		hs.add(6);
		hs.add(1);
		hs.add(9);
		System.out.println("HashSet: " +hs);
		
		//LinkedHashSet
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.addAll(hs);
		System.out.println("LinkedHashSet: " +lhs);
		System.out.println(lhs);

	}

}
