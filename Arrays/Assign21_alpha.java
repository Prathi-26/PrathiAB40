package Arrays;
public class Assign21_alpha 
{
	public static void main(String[] args)
	{
		int count_of_alphabet=0;
		boolean answer1;
		String name="Prathiksha";
		char[] a1=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isAlphabetic(a1[i]);
			System.out.println("answer1");
		
				if (answer1==true)
				{
					 count_of_alphabet++;
					 
				}
			}
			System.out.println("The number of alphabet in the given string is---> " +count_of_alphabet);
			
			if(name.length()==count_of_alphabet)
			{
				System.out.println("The given string consists only alphabet");
			}
		}
	}
	


