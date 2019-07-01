package com.rajju;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> stdMap = new HashMap<>();
		// add
		stdMap.put(134, "Std1");
		stdMap.put(54, "Std2");
		stdMap.put(94, "Std3");
		stdMap.put(124, "Std4");
		System.out.println(stdMap);
		// update
		stdMap.put(134, "Std1New");
		System.out.println(stdMap);
		// search
		System.out.println(stdMap.containsKey(54));
		
		String searchValue = "sTD4";
		System.out.println(stdMap.containsValue(searchValue));

		
		Set<Entry<Integer, String>> entry = stdMap.entrySet();
		for (Entry<Integer, String> e : entry) {
			int key = e.getKey();
			String value = e.getValue();
			if (value.toUpperCase().equals(searchValue.toUpperCase())) {
				System.out.println(searchValue + " Found");
			}
		}
		
		Integer key=134;
		String value=stdMap.get(key);
		
		if(value==null){
			System.out.println("key "+key+" not found");
		}
		else{
			System.out.println("Value : "+value);
		}
	}

}
