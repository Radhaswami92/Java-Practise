package ConstructorConcepts;

public class SuperUse extends ConstructDemo {

	String name="child";
	
	
	
	public void getdata()
	{
		//super.getdata();
		System.out.println(name);
		System.out.println("I am in child");
		System.out.println(super.name);
		
	}
	
	
	public SuperUse()
	{
		//super();
		//System.out.println("I am a child constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SuperUse obj= new SuperUse();
		obj.getdata();
		
		
		
		
		
		

	}

}
