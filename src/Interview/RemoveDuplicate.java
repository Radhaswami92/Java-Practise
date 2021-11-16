package Interview;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello Alexa";
		 String unique ="";


		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));

				//if (str.charAt(i) != unique.charAt(j)) {
				
				
				if (!unique.contains(String.valueOf(str.charAt(i)))) {
					
					unique = unique + String.valueOf(str.charAt(i));
				
					
				}

			
			
		}
		System.out.println(unique);
		
	}
	
}
