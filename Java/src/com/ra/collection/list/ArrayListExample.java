package com.ra.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListExample {

	public void arraylistE() {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("E");
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.indexOf("A"));
		System.out.println(arrayList.lastIndexOf("E"));

		List<String> anthorList = new ArrayList<String>();
		anthorList.addAll(arrayList);

		System.out.println(anthorList);
		anthorList.clear();
		System.out.println(anthorList);

		arrayList.remove(5);
		System.out.println(arrayList);

		arrayList.remove("A");
		System.out.println(arrayList);

		arrayList.set(0, "G");
		System.out.println(arrayList);

		System.out.println(arrayList.isEmpty());
		System.out.println(anthorList.isEmpty());

		// I terate
		for (String string : arrayList) {
			System.out.println("Using for Each :" + string);
		}
          System.out.println("-----------------------------------");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Using for Loop :" + arrayList.get(i));
		}
		System.out.println("-----------------------------------");
		ListIterator<String> List_iterator= arrayList.listIterator();
		
		while (List_iterator.hasNext()) {
			System.out.println(List_iterator.next());			
		}
		System.out.println("-----------------------------------");
		while(List_iterator.hasPrevious()) {
			System.out.println(List_iterator.previous());
			}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListExample arrayListExample = new ArrayListExample();
		arrayListExample.arraylistE();
		
		

	}
}
// In section order will be maintened and dublicate will be accessble.