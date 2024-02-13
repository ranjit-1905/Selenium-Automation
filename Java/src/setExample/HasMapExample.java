package setExample;

import java.util.DuplicateFormatFlagsException;
import java.util.HashMap;

public class HasMapExample {

	public void hasmap() {
	HashMap<Integer,String> EmployeeMap=new HashMap<Integer,String>();
	//to inster an element PUT method is Used
	EmployeeMap.put(1, "Arun");
	EmployeeMap.put(2, "Gani");
	EmployeeMap.put(3, "Selvam");
	EmployeeMap.put(4, "Kumar");
	EmployeeMap.put(5, "Indra");
	EmployeeMap.put(6, "Arun.j");
	
	System.out.println("Employee Map :" +EmployeeMap);
	
	HashMap<Integer,String> DupliacateMap=new HashMap<Integer,String>();
	DupliacateMap.putAll(EmployeeMap);
	
	System.out.println("DupliacateMap :" +DupliacateMap);
	
	DupliacateMap.clear();
	System.out.println("After Clear :" +DupliacateMap);
	
	//to check if a key is persent or not in map
	System.out.println("Does this map has key 1"+EmployeeMap.containsKey(2));
	
	//to check if a value is present or not
	System.out.println("Does ");
	
	}

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		
		HasMapExample hasMapExample=new HasMapExample();
		hasMapExample.hasmap();
	}
}
