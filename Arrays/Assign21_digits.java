package Arrays;
public class Assign21_digits 
{
	public static void main(String[] args)
	{
		int count_of_numeric=0;
		boolean answer1;
		String name="123456789";
		char[] a1=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isDigit(a1[i]);
			System.out.println("answer1");
		
				if (answer1==true)
				{
					 count_of_numeric++;
					 
				}
			}
			System.out.println("The number of digits in the given string is---> " +count_of_numeric);
			
			if(name.length()==count_of_numeric)
			{
				System.out.println("The given string consists only digits");
			}
		}
	}
	


