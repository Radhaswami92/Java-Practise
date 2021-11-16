package Oopsconcept;

public class PalindromeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value="madam";
		String t="";
		
		
		for(int i=value.length()-1;i>=0;i--)
		{
			//System.out.println(value.charAt(i));
			
			
			 t= t+ value.charAt(i);
			 
			 
		}
		
		System.out.println(t);
		//System.out.println(t);
		
			 
			if (t.equalsIgnoreCase(value))
			
			
				System.out.println("The string is palindrome");
				
			
			else
			
				System.out.println("The string is not palindrome");
			
	
	}
		
		
		
		
		
	}


