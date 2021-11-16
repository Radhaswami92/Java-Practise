package VariousLoops;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k=1;  //the no of times the inner loop will run , It will increment the count of inner loop will run
		//Since k variable is declared in the inner loop thats why the count will be based on that 
		for(int i=0;i<=3;i++)
		{
			//System.out.println("The outer loop has started for "+i);
			//System.out.print(i);
			//for(int j=4;j>=4-i;j--)  //This is also correct
				
			for(int j=0;j<=i;j++)
			{
				
				//System.out.println("The inner loop count  "+k);
				System.out.print(k);
				System.out.print("\t");//To give space after printing the number
				k++;
				
			}
			//k++;
			System.out.println("");
		}

	}


		
		
		
		
		


		
		
		
	}


