package com.phogi.sandbox;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

// Gets sorted list of unique items for ArrayList of HashMap

public class ListToSortedSet {
	
	public static void main (String[] args) {
		
		ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
		
		LinkedHashMap<String, String> map;
		
		map = new LinkedHashMap<String, String>();
		map.put("TestNo", "Reg5");
		map.put("ABC", "123");
		map.put("DEF", "456");
		list.add(map);
		
		map = new LinkedHashMap<String, String>();
		map.put("TestNo", "Reg4");
		map.put("ABC", "123");
		map.put("DEF", "456");
		list.add(map);

		map = new LinkedHashMap<String, String>();
		map.put("TestNo", "Reg1");
		map.put("ABC", "123");
		map.put("DEF", "456");
		list.add(map);

		map = new LinkedHashMap<String, String>();
		map.put("TestNo", "Reg3");
		map.put("ABC", "123");
		map.put("DEF", "456");
		list.add(map);
		
		TreeSet<String> set = new TreeSet<String>();
		
		for (Map<String, String> item : list) {
			set.add(item.get("TestNo"));
		}
		
		System.out.println(list);
		System.out.println("\n\n\n\n");
		System.out.println(set);
		System.out.println("\n\n\n\n");
		
		for (String test : set) {
			System.out.println(test);
		}
		
		
		
		
		
	}
	
	
	

}
