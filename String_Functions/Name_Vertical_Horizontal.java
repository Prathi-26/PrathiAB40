package String_Functions;
public class Name_Vertical_Horizontal 
{
	public static void main(String[] args) 
	{
		String name="Prathiksha";
		/* for(int i=0; i<name.length();i++)
		{
			
			//System.out.println(name.charAt(i)); //Vertical Printing
			System.out.print(name.charAt(i)); //Horizontal Printing
			
		}*/
		//System.out.println("====================");
// printing name in reverse
		
	 for(int i=name.length()-1; i>=0;i--)
	{
		
		//System.out.println(name.charAt(i));
		System.out.print(name.charAt(i));
	}
}	
}
