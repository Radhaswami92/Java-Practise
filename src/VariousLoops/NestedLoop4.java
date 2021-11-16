package VariousLoops;

public class NestedLoop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedLoop4 obj=new NestedLoop4();
		obj.printnormalsequence();
		System.out.println("The reverse sequence is ");
		obj.reverse();
		

	}
	
	/* 1 1 1 1 1
	 * 2 2 2 2
	 * 3 3 3
	 * 4 4
	 * 5
	 * */
	
	public void printnormalsequence() 
	
	{
		int k=1;
		for(int i=0;i<=4;i++) 
		
		{
			for(int j=0;j<=i;j++)
				
			{
				System.out.print(k);
				System.out.print("\t");
			}
			
			k++;
			System.out.println("");
		}
		
		
		
		
	}
	
	
	public void reverse() 
	{
		int k=5;
		for(int i=0;i<=4;i++)
			
		{
			for(int j=0;j<=4-i;j++)
			{
				
				System.out.print(k);
			    System.out.print("\t");
			
		}
		
		k--;
		System.out.println("");
		
		
	
		}
	}
}

