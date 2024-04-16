package Arrays;
import java.util.Arrays;
public class Simple_Array
{
	public static void main(String[] args)
	{
		int age[]= new int[5];
		age[0]=10;
		age[1]=20;
		age[2]=30;
		age[3]=40;
		age[4]=50;
		/* System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);*/
		
		 for(int i=0;i<5;i++)
		{
			System.out.println(age[i]);
		} 
		 
		System.out.println(Arrays.toString(age)); 

	}
}
