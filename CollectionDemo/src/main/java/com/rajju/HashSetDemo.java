package com.rajju;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> names=new HashSet<>();
		names.add("Rajju");
		names.add("Raje");
		names.add("Rajju");
		names.add("Bhajju");
		names.add("Vishal");
		names.add("Anant");
		names.add("Java");
		names.add("Dot net");
		System.out.println(names);
		
		System.out.println(names.remove("Java"));
		
	}

}
