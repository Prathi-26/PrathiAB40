package Arrays;
import java.util.Arrays;
public class Two_Arrays_Same 
{
	public static void main(String[] args) 
	{
		int number[]=new int[4];
		int num[]=new int[4];
		int k=num.length-1;
		number[0]=10;
		number[1]=20;	
		number[2]=30;
		number[3]=40;
		for(int i=0;i<number.length;i++)
		{
			num[k]=number[i];
			k--;
		}
		System.out.println("The first array is-->" +Arrays.toString(number));
		System.out.println("The second array is-->" +Arrays.toString(num));
	}
}
