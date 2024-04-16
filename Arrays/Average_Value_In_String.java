package Arrays;

public class Average_Value_In_String 
{
 public static void main(String[] args) 
 {
	int number[] = new int[5];
	number[0]=10;
	number[1]=20;
	number[2]=30;
	number[3]=40;
	number[4]=50;
	int sum=0;
	for(int i=0;i<number.length;i++)
	{
		sum= sum + number[i];
	}
	System.out.println(sum);
	double average = sum / number.length;
 System.out.println(average);
 
 }
 }
	
