package String_Functions;

public class Replace_A_with_M 
{
	public static void main(String[] args)
	{
		String name= " Prathiksha123";
		String output = name.replace('a',' ');
		System.out.println(output);// removes a
		System.out.println(name.replace('a','m')); // replaces a with m
		System.out.println(name.replaceAll("[A-Z]","")); //remove all the capital letters
		System.out.println(name.replaceAll("[a-z]","")); //remove all the small letters
		System.out.println(name.replaceAll("[0-9]","")); // removes the digits
		
}
}