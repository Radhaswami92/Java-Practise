package Oopsconcept;

import java.util.ArrayList;

public class ArrayListconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars=new ArrayList<String>();
		
		cars.add("BMW");
		cars.add("Volvo");
		cars.add("Mercedes");
		cars.add("Maruti");
		
		System.out.println(cars.get(1));
		
		System.out.println(cars.size());
		System.out.println(cars.clone());
		cars.set(3, "Herohonda");
		System.out.println(cars.get(3));
		System.out.println(cars);
		cars.remove(3);
		System.out.println(cars);
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
		cars.clear();
		System.out.println(cars);
		
		ArrayListconcept obj=new ArrayListconcept();
		obj.convertlettertoupcase();
		
		}
	
	public void convertlettertoupcase() 
	{
		String s="uppercase";
		System.out.println(s.substring(0, 2));
		System.out.println(s.subSequence(0, 2));
		
	    String b=s.substring(0, 1);
	    
	    
	    String c=s.substring(1);
	    System.out.println(c);
	    
	    b=b.toUpperCase();
	    System.out.println(b);
	    
	    System.out.println(b+c);
		
		
		
	}
	
	

}
