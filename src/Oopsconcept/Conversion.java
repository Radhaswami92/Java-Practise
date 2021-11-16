package Oopsconcept;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="name";
		
		//System.out.println(a.charAt(0));	
		
		
	    String j ="";
	    String l="Steve Jobs";
	    
	    j=j+a.charAt(0);
	    
	    j=j.toUpperCase();
	    a=a.substring(1);
	    System.out.println(j+a);
	    
	    //System.out.println(j)
		
		String[] array=l.split(" ");
		System.out.println(array[0]+array[1]);
		String k=array[0]+array[1];
		System.out.println(k.length());

		
		for(int i=1;i<=4;i++)
		{
			
			for(int u=1;u<=i;u++)
			{
				System.out.print("*");
				System.out.print("\t");
				
			}
			System.out.println("");
			
			
		}
		
		
		
		
	}

}
