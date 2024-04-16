package String_Functions;
import java.util.Date;
public class String_Date 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());//machine time
		
		Date d2= new Date(d1.getTime()); //human time
		System.out.println(d2);
		
		String curenttime=d2.toString();
		Date future_time =new Date(d1.getTime()+(1000*60*60*24*5)); // futuretime
		System.out.println(future_time);
		
		Date future_time1 =new Date(d1.getTime()-(1000*60*60*24*5));//pasttime 
		System.out.println(future_time1);
		
		String month=curenttime.substring(4,7);
		System.out.println(month);
		
		String date= curenttime.substring(8,10);
		System.out.println(date);
		
		String year= curenttime.substring(24);
		System.out.println(year);
		
		System.out.println(month.concat(date).concat(year));
		System.out.println(month.concat(" ").concat(date).concat(" ").concat(year));
		
	}
}
