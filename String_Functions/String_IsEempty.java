package String_Functions;

public class String_IsEempty 
{
	public static void main(String[] args)
	{
		String name= "I am Prathiksha";
		System.out.println(name);
		
		System.out.println(name.isEmpty());// Name is not empty so answer is boolean false
	    
		String name1= "";
		System.out.println(name1.isEmpty());// Name ist empty so answer is boolean true
		
		System.out.println(name.lastIndexOf('a'));// prints the index value
		
		System.out.println(name.equalsIgnoreCase("i am prathiksha")); //Equals ignore case
		
		System.out.println(name.repeat(5)); // Repetition is done
		
		System.out.println(name.toCharArray()); // toCharyArray
		
		
		
	}
	
}

