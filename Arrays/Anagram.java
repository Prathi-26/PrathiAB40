package Arrays;
import java.util.Arrays;
public class Anagram 
{
	public static void main(String[] args)
	{
		String a1="horse";
		String a2="shore";
		
		char []c1=a1.toCharArray();
		char []c2=a2.toCharArray();
		
		System.out.println(Arrays.toString(c1)); //printing the arrays 
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1)); //sorting
		
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c2));//sorting
		
		
		boolean a3=Arrays.equals(c1,c2);
		if(a3==true)
		{
			System.out.println("They are anagram of each other");
		}
		else
		{
			System.out.println("They are not anagram of each other");
		}
	}
}