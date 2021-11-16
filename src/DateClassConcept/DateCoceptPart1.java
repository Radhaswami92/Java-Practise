package DateClassConcept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCoceptPart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
		
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		SimpleDateFormat s=new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		System.out.println(s.format(d));
		

	}

}
