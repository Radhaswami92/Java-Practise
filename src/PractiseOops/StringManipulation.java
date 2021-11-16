package PractiseOops;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="soumya";
		String x="Soumya&banerjee";
		
		String b="";
		
		/* s o u m y a */
		/* 0 1 2 3 4 5 */
		
		System.out.println(a.charAt(0));
		
		System.out.println(a.substring(1));
		
		System.out.println(a.substring(0, 1));
		
		//String[] array=a.subSequence(0, 0)
		
		//int begin index == stating --iunt end index
		
		b=a.substring(0, 1);
		
		String c=a.substring(1, 6);
		
		b=b.toUpperCase();
		System.out.println(b+c);
		
		String[] array=x.split("&");
		
		System.out.println(array[0]+" "+array[1]);
		
		System.out.println(a.length());

		
		
		/* 
		 * array[0]=Soumya
		 * array[1]=Banerjee
		 *  
		 *  */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
