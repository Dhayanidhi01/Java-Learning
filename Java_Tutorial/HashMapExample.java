package Java_Tutorial;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	HashMap<Integer, String> employeeMap=new HashMap<Integer, String>();
	employeeMap.put(1, "Dhaya");
	employeeMap.put(2, "Divya");
	employeeMap.put(3, "Suganthi");
	employeeMap.put(4, "Babu");
	
	System.out.println(employeeMap);
	System.out.println(employeeMap.get(1));
	
	HashMap<Integer, String> DuplicateAll=new HashMap<Integer, String>();
	
	DuplicateAll.putAll(employeeMap);
	
	System.out.println(DuplicateAll);
	
	
	DuplicateAll.clear();
	
	System.out.println("After clear: " + DuplicateAll);
	
	
	//Return to Boolean "True or False" - Verify the data
	System.out.println(employeeMap.containsKey(4));
	System.out.println(employeeMap.containsValue("Suganthi"));
	
	
	//Verify the data in the DuplicateMap - it is return to boolean menthod - true or false
	
	System.out.println(DuplicateAll.isEmpty());
	
	
	// only retrieve the employeeID in Database
	
	
	System.out.println(employeeMap.keySet());
	
	
	//Only retrieve the employee names
	
	System.out.println(employeeMap.values());
	
	//Retrieve the all employeeID and name
	System.out.println(employeeMap.entrySet());
	
	
	}

}
