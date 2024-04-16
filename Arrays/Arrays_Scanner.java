package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Scanner 
{
	public static void main(String[] args)
	{
		int num[]= new int[3];
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the integer");
		for(int i=0;i<num.length;i++)
		{
			num[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(num));
	}
	
}
