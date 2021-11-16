package PractiseOops;

public class ReversAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Amamal";
		String c="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			c=c+a.charAt(i);
			
		}
		System.out.println(c);

	}

}
