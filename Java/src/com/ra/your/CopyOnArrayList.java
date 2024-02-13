package com.ra.your;

import java.util.Iterator;

import java.util.concurrent.CopyOnWriteArrayList;



public class CopyOnArrayList {

	public void syncarraylistExample() {
		
		CopyOnWriteArrayList<String> arrayList= new CopyOnWriteArrayList<String>();
		arrayList.add("Pen");
		arrayList.add("Book");
		arrayList.add("Pencil");
		arrayList.add("SchoolBag");
	
		System.out.println(arrayList);
		
		
	
		Iterator<String> syIterator= arrayList.iterator();
		while (syIterator.hasNext()) {
			System.out.println(syIterator.next());
			
				arrayList.add(4,"Box");
				System.out.println(arrayList);
			
				arrayList.remove(4);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnArrayList arrayListExample = new CopyOnArrayList();
		arrayListExample.syncarraylistExample();

	}

}
