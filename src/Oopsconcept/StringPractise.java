package Oopsconcept;

public class StringPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="raman/gaman";
		
		String array[]=s.split("/");
		System.out.println(array[0]+array[1]);
		System.out.println(array[1]);
		StringPractise obj=new StringPractise();
		obj.Stringcon(s);
		
		
	}
		
		public void Stringcon(String l) 
		
		
		{
		
			System.out.println(l);
			
		}
		
		
	}


