package VariousLoops;

public class NestedLoop3 {

	public static void main(String[] args) {
		
		
		NestedLoop3 obj=new NestedLoop3();
		obj.printreverse();
		
		
		
	}
		// TODO Auto-generated method stub
		
		
		
		
		public void printnormalsequence() {

		for(int i=0;i<=3;i++) 
		
		
		{
			//System.out.println("Please match the ,following sequence for i-th value "+i);
			
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(j);
				System.out.print("\t");
				
				
			}
			System.out.println("");
			
		}
		
		
		/*
		 * 0
		 * 01
		 * 012
		 * 0123
		 * */
				
	}
	
	public void printreverse() 
	{
		
		for(int i=0;i<=3;i++)
			
		{
			for(int j=0;j<=3-i;j++)
			{
				
				System.out.print(j);
				System.out.print("\t");
				
				
			}
			
			System.out.println("");
		}
		
		
		
	}
}


