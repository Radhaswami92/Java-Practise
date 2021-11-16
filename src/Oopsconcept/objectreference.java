package Oopsconcept;

public class objectreference {
	
	String a="Jeet";
	int employeeid=1234;

	String b;
	int servicerid;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		objectreference call=new objectreference();
		call.display();
		call.display("Sam", 456);
		call.b="Sudarshan Chakra";
		call.servicerid=45698;
		call.displaytext();
		
		
		
	}
	
	
	public void display() 
	
	{
		
		System.out.println(a+employeeid);
		
	}
	
	public void display(String s, int c) 
	{
		
		b=s;
		servicerid=c;
		System.out.println(s+c);
	}
	
	public void displaytext()
	{
	
		System.out.println("My name is "+b);
		System.out.println("My service id is "+servicerid);
	}

	
	
	
}
