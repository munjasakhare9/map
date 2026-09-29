package com.demo.map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMapDemo {
	public static void main(String[] args) {
		
		Student s1=new Student(103, "John");
		Student s2=new Student(102, "David");
		Student s3=new Student(103, "Orlen");
		
		Map<Integer, Student> map = new HashMap<>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		
		System.out.println(map);
		
		//print using for each loop(entrySet())
		Set<Entry<Integer, Student>> entrySet=map.entrySet();
		for(Entry<Integer, Student> entry:entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("=================================================");
		
		//print using for each loop (keySet())
		Set<Integer> keySet=map.keySet();
		for(Integer key:keySet) {
			System.out.println(map.get(key));
		}
		
	}
}
