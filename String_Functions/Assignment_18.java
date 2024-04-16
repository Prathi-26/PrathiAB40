package String_Functions;
import java.util.Date;
public class Assignment_18 
{

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());//machine time
		
		Date d2= new Date(d1.getTime()); //human time
		System.out.println(d2);
		
		String curenttime=d2.toString();
		Date future_time =new Date(d1.getTime()+(1000*60*60*24*10)); // futuretime
		System.out.println(future_time);
		
		
}
}