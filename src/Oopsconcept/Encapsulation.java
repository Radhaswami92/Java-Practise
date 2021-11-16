package Oopsconcept;

public class Encapsulation {
	
	private int mainid;
	
	public int getEmpid() 
	{
		
		return mainid;
		
		
		
	}
	public void setEmpid(int emp) 
	{
		mainid=emp;//mainid is the instance variable 
	
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation obj=new Encapsulation();
		obj.setEmpid(110);
		System.out.println(obj.getEmpid());
		
		
		

	}
	
	
}
