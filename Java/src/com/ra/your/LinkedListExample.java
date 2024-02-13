package com.ra.your;

import java.util.LinkedList;

public class LinkedListExample {
	
	public void linkedlistOperationExample() {
		//Create a simple Linked List
		
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(4);
		
		System.out.println("Linked List :" +linkedList);
		
		//Add the element on the first of List
		linkedList.addFirst(0);
		System.out.println("Linked List after add first :" +linkedList);
		//Add the element on the Lost of List
		linkedList.addLast(5);
		System.out.println("Linked List after add last :" +linkedList);
		
		//Get first value of List
		System.out.println("First Value : " +linkedList.getFirst());
		
		//Get the first value using index Postion
		System.out.println("first value using index Postion  :" +linkedList.get(0));
		
		//Get the three value of list
		System.out.println("first value using index Postion  :" +linkedList.get(3));
		
		//Get Last Value of List
		System.out.println("First Value : " +linkedList.getLast());
		 System.out.println("-----------------------------------");
		//remove the value for the list
		System.out.println("Remove first :"+linkedList.remove(5));
		System.out.println("Linked List :" +linkedList);
		System.out.println("Remove first :"+linkedList.removeFirst());
		System.out.println("Linked List :" +linkedList);
		System.out.println("Remove first :"+linkedList.removeLast());
		System.out.println("Linked List :" +linkedList);
		 System.out.println("-----------------------------------");
		//Poll delete the first
		System.out.println("Remove first :"+linkedList.poll());
		System.out.println("Linked List :" +linkedList);
		System.out.println("Remove first :"+linkedList.pollFirst());
		System.out.println("Linked List :" +linkedList);
		System.out.println("Remove first :"+linkedList.pollLast());
		System.out.println("Linked List :" +linkedList);
		 System.out.println("-----------------------------------");
		 
		 //Adding
		 linkedList.addFirst(1);
		 linkedList.add(2);
			linkedList.add(3);
			linkedList.add(4);
			linkedList.add(5);
			linkedList.add(6);
			
			//removeFirstOccurence
		  linkedList.removeFirstOccurrence(2);
		  System.out.println("After Removing the first Occurance of 2"+linkedList);
		  
		  linkedList.removeLastOccurrence(6);
		  System.out.println("After Removing the Last Occurance of 6"+linkedList);
		  
		  System.out.println("-----------------------------------");
				
	}
		  public void iterateLinkedListWithsimpleFor() {
			  
			  LinkedList<String> linkedList =new LinkedList<String>();
			  linkedList.add("A");
				linkedList.add("B");
				linkedList.add("C");
				linkedList.add("D");
				linkedList.add("E");
				System.out.println("Simple For Loop");
				for (int index =0 ; index<linkedList.size();index++) {
					System.out.println("Element in the LL are "+linkedList.get(index));
									
				}
				System.out.println("-----------------------------------");
		  }
				//iterate of Linked List with Advanced For Loop(for Each)
				
				public void iteratedLinkedListWithAdvancedFor() {
					
					LinkedList<String> linkedList2 =new LinkedList<String>();
					  linkedList2.add("A");
						linkedList2.add("B");
						linkedList2.add("C");
						linkedList2.add("D");
						linkedList2.add("E");
						System.out.println("For Each");
						for (String string:linkedList2) {
						System.out.println("Elements in the LL are "+string);
				}
						System.out.println("-----------------------------------");
				}
				
				
					
		   		  
		  
		  
		  
		  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListExample example=new LinkedListExample();
		example.linkedlistOperationExample();
		example.iterateLinkedListWithsimpleFor();
		example.iteratedLinkedListWithAdvancedFor();
           
	}

}
