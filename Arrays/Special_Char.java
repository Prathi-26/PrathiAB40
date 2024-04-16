package Arrays;
import java.util.Arrays;
public class Special_Char
{
	public static void main(String[] args)
	{
		int count_of_alphabet=0;
		int count_of_digit=0;
		int count_of_space=0;
		boolean answer1;
		String name="Prathi@#123";
		char[] a1=name.toCharArray(); 
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isAlphabetic(a1[i]);
			System.out.print("answer1 \t");
			if (answer1==true)
				{
					 count_of_alphabet++;
				}
			}
			System.out.println("");
			//System.out.println("The number of alphabet in the given string is---> " +count_of_alphabet);
			
			for(int i=0;i<name.length();i++)
			{
				answer1=Character.isDigit(a1[i]);
				System.out.print("answer1 \t");
				if (answer1==true)
			{
				 count_of_digit++;
			}
		}
		System.out.println("");
		//System.out.println("The number of digit in the given string is---> " +count_of_digit);
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isSpaceChar(a1[i]);
			System.out.print("answer1 \t");
			if (answer1==true)
		{
			 count_of_space++;
		}
	}
	System.out.println("");
	//System.out.println("The number of digit in the given string is---> " +count_of_space);
	int Special= name.length()-count_of_alphabet++ -count_of_digit++ - count_of_space++;
	System.out.println(" The number of Special Character are--->" +Special);
	}
}
	

