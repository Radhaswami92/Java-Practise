package Interview;

public class Question {

	String name; // Instance variable
	static String address;
	static String city; // class variable
	static int i;// If static keyword is not given then it will take the fresh value everytime a
						// after each operation
	
	static {
		
		i=0;
		//city="banagalore";
		
	}
	
	
	
	

	Question(String name, String address,String city) { // lo

		this.name = name;
		Question.address = address;
		Question.city=city;
		/* this.city=city; */

	}

	/*
	 * public void getdata() {
	 * 
	 * System.out.println(name+address+city);
	 * 
	 * }
	 */
	public void getaddress() {

		System.out.println(name+" "+address + " " + city);
		i++;
		System.out.println(i);
	}
	
	public static void getcity() {
		
		System.out.println(address);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Question obj=new Question("Jeet ","Dhubri ","Assam ");
		//Question obj = new Question("Jeet ", "Dhubri");
		obj.getaddress();
		Question.getcity();
		
		 Question obj1=new Question("Jitaditya","Kolkata","West Bengal");

		//Question obj1 = new Question("Jitaditya", "Kolkata");
		
		
		obj1.getaddress();
		Question.getcity();
		
		// System.out.println(i);This line will throw error because the in variable is
		// not static . In static method we can call only static variable
		
		
		

	}

}
