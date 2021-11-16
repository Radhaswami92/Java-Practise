package VariousLoops;

public class Nestedloop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		for(int i=0;i<=3;i++)
		{
			System.out.println("The outer loop has started"+i);
			for(int j=1;j<=4;j++) 
			{
				
				System.out.println("The inner loop has started"+j);
				
			}
			
			System.out.println("The outer loop is finished"+i);
		}

	}



public void horizantal() 

{
	int j = 0;
	for(int i=0;i<=3;i++)
		
	{
		j=j+i;
		System.out.println(i);
		
		
	}
		
}

}





