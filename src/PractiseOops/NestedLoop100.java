package PractiseOops;

public class NestedLoop100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1 12 123 1234 12345
		 */
		// for(datatype variable : variable compare/condition : variable
		// increment/decrement)
		
		int k=1; // The no of times inner loop will run by incrementing the value and storing the same after each run

		for (int i = 1; i <= 5; i++)

		{
			for (int j = 1; j <= i; j++) {

				System.out.print(k);
				System.out.print("\t");
				k++;
			}

			System.out.println("");

		}

		/*
		 * print-same line println-line new /next line ("") (object) (variable)
		 * (obj.function) (array[0])
		 * 
		 * 
		 */

	}

}
