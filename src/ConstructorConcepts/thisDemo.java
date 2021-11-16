package ConstructorConcepts;

public class thisDemo {
	
	String name="Java"; 
	int empid;
	
	
	
	public void getdata() 
	{
		int doj=2;
		System.out.println("My date of joining is "+doj);
		this.empid=102;
		System.out.println("My moto is to completed "+this.name+"\t"+"and my employee id is "+this.empid);
		int empid=4;
		int result=this.empid+empid;
		System.out.println(result);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		thisDemo obj=new thisDemo();
		obj.getdata();
	}

}
