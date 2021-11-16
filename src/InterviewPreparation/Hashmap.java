package InterviewPreparation;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map=new HashMap<String, String>();
		
		map.put("Assam", "Dispur");
		map.put("Punjab", "Chandigarh");
		map.put("Rajasthan", "Jaipur");
		
		
		for(String i:map.values()) {
		
		System.out.println(i);
		
		}
		
		
		
	}

}
