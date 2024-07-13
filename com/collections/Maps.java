package com.collections;

import java.util.*;

public class Maps
{

	public static void main(String[] args) 
	{
		//HashMap
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(3, "Three");
		hmap.put(3, "Three");		
		hmap.put(1, "One");	
		hmap.put(36, null);		
		hmap.put(4, "Four");
		hmap.put(50, "Fifty");
		hmap.put(2, "Two");		
		hmap.put(100, "Hundred");
		hmap.put(50, "Fifty");
		System.out.println("Hash Map: " +hmap);
		System.out.println(hmap.entrySet());
		
		//TreeMap
		Map<Integer, String> tmap = new TreeMap<>();
		tmap.putAll(hmap);
		System.out.println("Tree Map:" +tmap);
		
		//LinkedHashMap
		Map<Integer, String> lhm = new LinkedHashMap<>();
		lhm.putAll(hmap);
		System.out.println("Linked Hash Map: " +hmap);
		
	}

}
