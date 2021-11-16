package ExceptionHandling;

public class AllExceptionHandler {
	
	
	static int a=45;
	static int b=0;
	static int k;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array=new int[5];
		
		array[1]=17;
		
	
		try 
		{
			
		k=a/b;
		System.out.println(array[5]);

			
			}
		
		
		catch(ArithmeticException es) {
			
			System.out.println("I have caught the arithmatic exception");
		}
		
		catch(Exception e) {
			
			System.out.println("I have caught the error");
		}
		
		try 
		{
			
		
		System.out.println(array[5]);

			
			}
		
catch(IndexOutOfBoundsException est) {
			
			System.out.println("I have caught the arry exception");
		}
		
		
		
	}

}
