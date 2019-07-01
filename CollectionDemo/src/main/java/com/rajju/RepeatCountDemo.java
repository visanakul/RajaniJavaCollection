package com.rajju;

import java.util.Map;
import java.util.TreeMap;

public class RepeatCountDemo {

	public static void main(String[] args) {
		String name = "raajjjannnni";
		Map<Character, Integer> charSet = new TreeMap<>();
		char nameArr[] = name.toCharArray();
		for (char c : nameArr) {
			if (!charSet.containsKey(c)) {
				charSet.put(c, 1);
			} else {
				int v=charSet.get(c);
				charSet.put(c, ++v);
			}
		}
		System.out.println(charSet);
		
		
		String statement = "I love rajju.    I LOVE India.";
		Map<String, Integer> wordSet = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		String wordArr[] = statement.replace('.',' ').replaceAll(" +"," ").split(" ");
		for (String s : wordArr) {
			if (!wordSet.containsKey(s)) {
				wordSet.put(s, 1);
			} else {
				int v=wordSet.get(s);
				wordSet.put(s, ++v);
			}
		}
		System.out.println(wordSet);
	}

}
