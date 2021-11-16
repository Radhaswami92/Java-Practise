package ArrayConcept;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Single dimensional array stores mutilple values of single datatype withing same variable 
		//We can retrieve the numbers with the help of index value
		
		//Two ways to initialize array 
		   //a. Declaring the array in the same line ny defining the values
		   //b. Declaring the size of the array first and then assign values with the index .
		
		int i[]= {1,2,3,4};
		
		int ai[]=new int[5];
		
		ai[0]=2;
		ai[1]=2;
		ai[2]=2;
		ai[3]=2;
		ai[4]=3;
		System.out.println(ai[4]);

		System.out.println(i[3]);
		System.out.println(ai.length);
		
		for(int k=0;k<ai.length;k++) {
			
			System.out.println(ai[k]);
		}
		
	for(int k=0;k<i.length;k++) {
			
			System.out.println(i[k]);
		}
		
	}

}
