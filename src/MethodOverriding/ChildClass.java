package MethodOverriding;

public class ChildClass extends ParentClass {
	
	int a=10;

	public void Engine() {

		System.out.println("Bike Enginer child ");
	}

	public void vehiclenumber(String s)

	{
		System.out.println("My child bike number is " + s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		ChildClass call=new ChildClass();
		call.Engine();
		call.vehiclenumber("AS17324");
		
		ParentClass call1=new ParentClass();
		call1.Engine();
	
		
		System.out.println(call.a);
		
	}

}
