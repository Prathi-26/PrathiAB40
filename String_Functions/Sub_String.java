package String_Functions;

public class Sub_String 
{
	public static void main(String[] args) 
	{
		String input="I am Student";
		
		boolean answer1= input.contains("Prathiksha"); // contains function false
		System.out.println(answer1);
		
		boolean answer2= input.contains("Student"); // contains function true
		System.out.println(answer2);
		
		String answer3= input.substring(5);
		System.out.println(answer3); // Substring with one index value
		
		String answer4= input.substring(2, 4);
		System.out.println(answer4);// Substring with two index value
		
		System.out.println(input.concat(" Prathiksha"));// concatenation
		
	
	}
}
