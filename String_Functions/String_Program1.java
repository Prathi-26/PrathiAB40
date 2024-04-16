package String_Functions;
public class String_Program1 
{
	public static void main(String[] args)
	{
		String name="Prathiksha";
		int size=name.length();
		System.out.println(size);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf('k'));
		System.out.println(name.equals("prathiksha"));
		System.out.println(name.equals("Prathiksha"));
	}
}