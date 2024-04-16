package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays_Assignment 
{
	public static void main(String[] args)
	{
		
		
		int digit;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the digit : ");
		digit=s1.nextInt();
		if(digit%3==0)
		{
			System.out.println("frog");
		}
		if(digit%5==0)
		{
			System.out.println("Cat");
		}
		 if(digit%3==0 && digit%5==0)
		{
			
			System.out.println("Frog & Cat");
		}
	}
}
