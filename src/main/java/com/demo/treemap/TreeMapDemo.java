package com.demo.treemap;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> map=new TreeMap<>();
		map.put("ashok", 101);
		map.put("vamsi", 200);
		map.put("raja", 50);
		
		System.out.println(map);
	}
}
