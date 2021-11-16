package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set does not store duplicate elements or values
		// Set doesn't maintain the insertion order of the element , it has no sequence
		// manner
		// Tree set, hashset, linked hash set has the same concept

		HashSet<String> hs = new HashSet<String>();
		hs.add("Hello");
		hs.add("java");
		hs.add("Extreme");
		System.out.println(hs);
		// hs.remove("Extreme");
		System.out.println(hs.size());
		// System.out.println(hs);
		hs.add("java");
		hs.add("java");
		// System.out.println(hs);
		// hs.clear();
		System.out.println(hs);
		// hs.isEmpty();
		System.out.println(hs.isEmpty());

		Iterator<String> it = hs.iterator();

	
		while (it.hasNext()) {
			System.out.println(it.next());
			// it.next --> The return type is string value //It will help us to store the id
			// of the window in selenium
			// Get window handles concept
			
			
			

		}

	}

}
