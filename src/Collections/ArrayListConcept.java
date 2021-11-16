package Collections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Selenium");
		a.add("Java");
		a.add("Jjenkins");
		
		System.out.println(a);
		a.add(1, "maven");
		System.out.println(a);
		a.ensureCapacity(2);
		a.add("hello");
		;
		
		System.out.println(a.contains("hellso"));
		
		System.out.println(a.indexOf("Jjenkins"));
		

	}

}
