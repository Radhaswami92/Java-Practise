package ConstructorConcepts;

public class ConstructDemo {
	
	static int x=10;
	static int y=20;
	
	String name="Parent";
	public ConstructDemo() {
		
		
		System.out.println("I am a parent constructor");
	}
	
	
     public ConstructDemo(int a){
		
		
		System.out.println("I am a parameterized constructor with an integer value "+a);
	}
	
     public ConstructDemo(String a){
 		
 		
 		System.out.println("I am a parameterized constructor with an string  value "+a);
 		System.out.println("The initial value of x is "+x);
 		System.out.println("The initial value of y is "+y);
 		
 		
 		
 	}
	
     public void getdata() {
    	 
    	 System.out.println("I am in parent");
     }
    
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructDemo call=new ConstructDemo();
		ConstructDemo call1=new ConstructDemo(5);
		ConstructDemo call2=new ConstructDemo(6);
		ConstructDemo call3=new ConstructDemo("Hello I am jeet");
		
		x=x+y;
 		y=x-y;
 		x=x-y;
 		System.out.println("The value of x is "+x);
 		System.out.println("The value of y is "+y);
 		
		
		
	}

}
