//Testing how Date object works for time-stamps
import java.util.Date;
public class DateTest{

	Date today = new Date();
	
	public static void main(String[]args){
		DateTest dt = new DateTest();
		dt.go();
	}

	public void go(){
		String s = String.format("%tA, %tB %td", today, today, today);
		System.out.println(s);//Output: Sunday, December 21
		s = String.format("%tc", today);
		System.out.println(s);//Sun Dec 21 15:59:35 GMT 2025
		s = String.format("%tr", today);
		System.out.println(s);
		s = String.format("%tA, %<tB %<td", today);
		System.out.println(s);


	}
}
