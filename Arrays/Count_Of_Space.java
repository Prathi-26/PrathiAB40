package Arrays;
public class Count_Of_Space 
{
	public static void main(String[] args)
	{
		int count_of_space=0;
		boolean answer1;
		String name="Prathiksha Malagavi"
				+ ""
				+ "";
		char[] a1=name.toCharArray(); 
		for(int i=0;i<name.length();i++)
		{
			answer1=Character.isSpaceChar(a1[i]);
			System.out.println("answer1");
		
				if (answer1==true)
				{
					count_of_space++;
					 
				}
			}
			System.out.println("The number of alphabet in the given string is---> " +count_of_space);
		}
	}
	


