package com.demo.duplicatekey;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Program1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		
		//HM will compare content of keys to find duplicate keys (equals())
		hm.put("ashok", 101);// 1 entry added
		hm.put("raja", 102);// 1 entry added
		hm.put("rani", 103);// 1 entry added
		hm.put(new String("ashok"), 104);//it will replace first entry bcz key is duplicate
		
		//hm.put("sham", 101);//<Object, Integer>
		//hm.put(new String("sham"), 106);
		//hm.put(new StringBuilder("rani"), 107);
		
		System.out.println("size :: "+hm.size());
		System.out.println(hm);
		
		System.out.println("==============================================");
		
		//IHM will compare address of keys to find duplicate key (==)
		IdentityHashMap<String, Integer> ihm=new IdentityHashMap<>();
		ihm.put("ashok", 101);// 1 entry added (scp)
		ihm.put("raja", 102);// 1 entry added
		ihm.put("rani", 103);// 1 entry added
		ihm.put(new String("ashok"), 104);// 1 entry added (heap area) address is diff from scp
		ihm.put("ashok", 105);// it will replace first entry value
		
		System.out.println("size :: "+ihm.size());
		System.out.println(ihm);
	}
}
