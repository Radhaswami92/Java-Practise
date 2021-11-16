package Oopsconcept;

public class MethodOverloading {

	
	
	public void display(String s,int i) 
	
	
	{
		
		
		System.out.println("My name is"+s+"\t"+"My roll no is "+i);
		
		
	}
	
	public void display(String j) 
	{
	 System.out.println("I am a student of "+j);	
	}
	
	public void display(int j) 
	{
		
		System.out.println(j);
		
	}
	
	public void display(int i, String s)
	{
		
		System.out.println(s+i);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj=new MethodOverloading();
		obj.display("Jeet", 10);
        obj.display("SPHS");
        obj.display(45561);
        obj.display(123, "card");
	}

}
