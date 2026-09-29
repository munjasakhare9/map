package com.demo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program1 {
	public static void main(String[] args) {
		Map<Integer, String>  map= new HashMap();
		map.put(101, "John");
		map.put(102, "Smith");
		map.put(103, "Orlen");
		map.put(null, null);
		map.put(102, "David");
		map.put(104, null);
		map.put(105, "David");
		map.put(10, "David");
		map.put(null, "Jack");
		//map.put(true, 500);
		//System.out.println(map.get(true));
		
		System.out.println("===================get(int)=====================");
		System.out.println(map.get(102));//David
		System.out.println(map.get(200));//null
		System.out.println(map.get(null));
		
		System.out.println("===================get(int)=====================");
		
		Set<Integer> keySet=map.keySet();
		System.out.println(keySet);
		
		for(Integer key: keySet) {
			System.out.println(key+" -- "+map.get(key));
		}
		System.out.println("===================values()=====================");
		Collection<String> values=map.values();
		for(String v: values) {
			System.out.println(v);
		}
		
		System.out.println("===================entrySet()=====================");
		Set<Entry<Integer, String>> entrySet=map.entrySet();
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
		System.out.println("===================iterator on enrtySet(Set)=====================");
		Set<Entry<Integer, String>> entrySet2=map.entrySet();
		Iterator<Entry<Integer, String>> iterator=entrySet2.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String>entry=iterator.next();
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
			
			
		System.out.println("================================================================");
		System.out.println(map);
		System.out.println("size :: "+map.size());
		System.out.println(map.containsKey(102));
		System.out.println(map.containsKey(200));
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map.size());
		
		
	}
}
