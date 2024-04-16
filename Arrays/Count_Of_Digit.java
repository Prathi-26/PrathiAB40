package Arrays;
public class Count_Of_Digit
{
	public static void main(String[] args) 
	{
		int count_of_numeric=0;
		boolean answer1;
		String name ="Prathiksha12345678v";
		char[] a1= name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isDigit(a1[i]);
			System.out.println(answer1);
			if (answer1==true)
			{
				count_of_numeric++;
			}
			
		}
		System.out.println("The number in the given String is-->"+count_of_numeric);
	}
}
