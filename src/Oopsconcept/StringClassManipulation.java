package Oopsconcept;

public class StringClassManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a=" Hello/world";
		String b="SIEMENS";
		
		System.out.println(a.charAt(1)); //To print the character by index value
		
		System.out.println(a.indexOf("o"));// To print the index of particluar character 
		System.out.println(a.substring(5));//To print the index starting from index value till the end of the whole string 
		System.out.println(a.substring(4));//To print the index starting from index value till the end of the whole string
		
		System.out.println(a.subSequence(2, 5)); //To print the character of the starting index and till the character before ending index
		
		System.out.println(a.concat(" How are you")); // TO print the concatenation of the new string with the strig persent in the variable
		
	    String array[]=a.split("/"); // It will split the whole string contains in 'a' variable by finding the delimeter which is passed  as '/'  
	    System.out.println(array[0]); // After splitting it is stored and break into arrays with the index values 
	    System.out.println(array[1]); // After splitting it is stored and break into arrays with the index values
	    
	    System.out.println(a.trim()); // It will trim if there is any spaces in a word 
	    
	    System.out.println(a.toCharArray()); // converts string into array 
	    System.out.println(array[0].toUpperCase()); // It will turn the text in the variable into uppercase
	    System.out.println(b.toLowerCase());// It will turn the text in the variable into lowercase
	    
	    System.out.println(a.length()-1); //It will print the length of the characters 
	    
	    for (int i=b.length()-1;i>=0;i--) 
	    {
	    	
	    	System.out.println(b.charAt(i));
	    	
	    	
	    	
	    }
	    System.out.println(a.subSequence(2, 11));
	    System.out.println(a=a+b.substring(0, 6));
	
		
		
	}

}
