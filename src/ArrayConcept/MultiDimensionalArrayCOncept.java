package ArrayConcept;

public class MultiDimensionalArrayCOncept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i[][]=new int[3][4];
		
		//In multi-dimensional array : There are 2 ways to initiallize the array . 
		
		   //a. you can define the size of the row and column first and then write the values with the help of index
		   //b.You can directly declare directly as well. Please look into the below method
		
		int abc[][]= {{4,5,6},{7,8,9},{10,11,12}};
		
		i[0][0]=1;
		i[0][1]=2;
		i[0][2]=3;
		i[0][3]=4;
		
		i[1][0]=10;
		i[1][1]=20;
		i[1][2]=0;
		i[1][3]=40;
		
		i[2][0]=100;
		i[2][1]=200;
		i[2][2]=600;
		i[2][3]=400;
		

		System.out.println(i.length);
		
		for(int k=0;k<i.length;k++) {
			
			for(int j=0;j<i.length+1;j++) {
			
			System.out.print(i[k][j]);
			System.out.print("\t");
			}
			
			System.out.println("");
		}
		
		System.out.println(abc[1][1]);
	
		
		// Print the smallest number in the matric : The code is goven below
		int minno=i[0][0];
		for(int s=0;s<i.length;s++) {
			
			for(int q=0;q<i.length+1;q++) {
				
				//minno=i[s][q];
				
				if(i[s][q]<minno) {
					
					minno=i[s][q];
					
				}
				
				
			}
			
			
		}
		System.out.println(minno);
		
	//The smallest number program ends here	
		
	}

}
