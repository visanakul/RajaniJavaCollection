package com.rajju;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> runs = new LinkedList<>();
		System.out.println("Size : " + runs.size());
		// Insert
		runs.add(10);
		runs.add(20);
		runs.add(10);
		runs.add(20);
		runs.add(10);
		runs.add(20);
		runs.add(10);
		runs.add(20);
		runs.add(10);
		runs.add(20);
		runs.add(10);
		runs.add(20);
		runs.add(1, 15);

		System.out.println(runs);
		System.out.println("Size : " + runs.size());

		// Search by element
		Integer se = 120;
		if (runs.contains(se)) {
			System.out.println(se + " found");
		} else {
			System.out.println(se + " not found");
		}

		int index = runs.indexOf(se);
		if (index == -1) {
			System.out.println(se + " not found");
		} else {
			System.out.println(se + " found at : " + index);
		}

		// Search by index
		try {
			index = 20;
			Integer ele = runs.get(index);
			System.out.println(ele);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index crossed");
		}
		// search all occurrences
		se=20;
		boolean flag = false;
		for (int i = 0; i < runs.size(); i++) {
			if (se == runs.get(i)) {
				flag = true;
				System.out.println("Found at : "+i);
			}
		}
		if(!flag){
			System.out.println(se+" not found...");
		}
		// Traverse
		System.out.println("Runs : " + runs);
		System.out.println("For loop By index : ");
		for (int i = 0; i < runs.size(); i++) {
			System.out.println(runs.get(i));
		}
		System.out.println("Enhanced For loop: ");
		for (Integer x : runs) {
			System.out.println(x);
		}
		System.out.println("Foreach");
		runs.forEach(System.out::println);

		// Forward traversal
		// remove()
		System.out.println("Iterator : ");

		showData(runs.iterator());

		// Forward and reverse traversal
		// remove(), add() and set() methods
		System.out.println("List Iterator : ");

		showData(runs.listIterator());
		
		//Update
		Integer oldEle=15;
		Integer newEle=25;
		index=runs.indexOf(oldEle);

		if(index==-1){
			System.out.println("Cannot update");
		}
		else{
			runs.set(index, newEle);
			System.out.println("Updated..."+runs);
		}
		
		//Delete
		Integer delEle=25;
		if(runs.remove(delEle)){
			System.out.println("Deleted "+runs);
		}
		else{
			System.out.println(delEle+" not found");
		}
		
		//sorting
		Collections.sort(runs);
		System.out.println("Ascending : "+runs);
		
		Collections.sort(runs,Collections.reverseOrder());
		System.out.println("Descending : "+runs);
		
	}

	private static void showData(Iterator<Integer> iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	private static void showData(ListIterator<Integer> listIterator) {
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("Reverse ");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
