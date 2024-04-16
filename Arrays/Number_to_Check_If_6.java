package Arrays;
public class Number_to_Check_If_6 
{
	public static void main(String[] args)
	{
		int roll_no[]=new int[4];
		roll_no[0]=10;
		roll_no[1]=20;
		roll_no[2]=6;
		roll_no[3]=70;
		int number_check=6;
		for(int i=0;i<roll_no.length;i++)
		{
			if(roll_no[i]==number_check)
			{
				System.out.println("We found the number "+number_check +" at the index position "  +i);
			}
			else
			{
				System.out.println("We could not found the number" +number_check +" at the index position"  +i);
			}
		}
	}
}
