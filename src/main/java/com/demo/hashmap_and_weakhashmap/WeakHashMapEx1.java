package com.demo.hashmap_and_weakhashmap;

import java.util.WeakHashMap;

public class WeakHashMapEx1 {
	public static void main(String[] args) {
		WeakHashMap<Integer, String> whm=new WeakHashMap<>();
		whm.put(1, "hii");
		whm.put(2, "hello");
		whm.put(4, "java");
		whm.put(3, "bye");
		
		System.out.println(whm);
	}
}
