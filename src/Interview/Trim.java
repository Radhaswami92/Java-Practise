package Interview;

import java.util.ArrayList;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Mushrooms - Button";

		String[] nameo = name.split("-");
		String actualname = nameo[0].trim();
		String Final="";
		System.out.println(actualname);

		String given = "This is my This my life is and its awesome";

		String splitgiven[] = given.split(" ");
		ArrayList<String> al = new ArrayList<String>();

		System.out.println(splitgiven[9]);

		System.out.println(splitgiven.length);
		

		for (int i = 0; i < splitgiven.length; i++) {


			if (!al.contains(splitgiven[i])) {

				al.add(splitgiven[i]);
			}

		}
		System.out.println(al);
		
		for(int j=0;j<al.size();j++) {
			
			Final=Final+"\t"+al.get(j);
			
		}
		
		System.out.println(Final);

	}

}
