package Collections;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*FOLLOWING POINTS TO REMEMBER THE DIFFERENCE BETWEEN HASHMAP AND HASHTABLE
 * 
 * HashMap is not synchronized. It means that hashmap can be acessed by multiple programes at the same time concurrently
 * Whereas Hashtable is synchronized . Unless the first program releases the resources of the table, the second program will not be able to access
 * HashMap allows one null key and multiple null values whereas as hastbale doesnot allow null key and values
 * Hashmap can be iterated through iterator but in hashtable we use enumerator to acheieve iteration
 * 
 * */
		
		Hashtable<String, Integer> ht=new Hashtable<String, Integer>();
		
		ht.put("Emoloyee1", 1001);
		ht.put("Emoloyee2", 1001);
		ht.put("Emoloyee2", 1002);
		ht.put("",null); // It will throw an exception
		
		//Since the Employee 2 (key) is duplicate and hence it will replace the previous value with the last updated value
		
		
		System.out.println(ht);
		
		
		
		
		
		
	}

}
