package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaPConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("India", "Delhi");
		hm.put("WestBengal", "Kolkata");
		hm.put("Rajasthan", "Jaipur");
		hm.put("", "");

		System.out.println(hm);

		System.out.println(hm.get("WestBengal")); // It will print the result of the value of that key
		hm.put("India", "fal"); // Here the key is duplicate but value is diff. So it has replaced the value of
								// the key
		hm.put("Asia", "fal");
		System.out.println(hm);

		Set<Entry<String, String>> sn = hm.entrySet();// It will conver the map into set

		Iterator it = sn.iterator();
		/*
		 * This block will print the key and value both since we have used the it.next ,
		 * it will consider both while (it.hasNext()) {
		 * 
		 * System.out.println(it.next()); }
		 * 
		 * 
		 */

		// In the below block we are seperating Key and value.
		while (it.hasNext()) {

			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());

			System.out.println(mp.getValue());

		}

	}

}
