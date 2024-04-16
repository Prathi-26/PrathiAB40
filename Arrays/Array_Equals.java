package Arrays;

import java.util.Arrays;

public class Array_Equals
{
	public static void main(String[] args)
	{
		int number1[] = new int[3];
		int number2[] = new int[3];
		number1[0]=10;
		number1[1]=30;
		number1[2]=30;
		number2[0]=10;
		number2[1]=20;
		number2[2]=30;
		
		boolean answer=Arrays.equals(number1,number2);
		System.out.println(answer);
	}
}