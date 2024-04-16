package Arrays;

public class Arrays_Table
{
	public static void main(String[] args)
	{
		int Roll_No[] =new int[5];
		Roll_No[0]=1;
		Roll_No[1]=2;
		Roll_No[2]=3;
		Roll_No[3]=4;
		Roll_No[4]=5;
		String Student_Name[]=new String[5];
		Student_Name[0]="Sita";
		Student_Name[1]="Rama";
		Student_Name[2]="Rita";
		Student_Name[3]="Sam";
		Student_Name[4]="Mona";
		char Gender[]= new char[5];
		Gender[0]='F';
		Gender[1]='M';
		Gender[2]='F';
		Gender[3]='M';
		Gender[4]='F';
		long Mobile_Number[]=new long[5];
		Mobile_Number[0]=98789;
		Mobile_Number[1]=87658;
		Mobile_Number[2]=64587;
		Mobile_Number[3]=98765;
		Mobile_Number[4]=98765;
		
		System.out.print("Roll_No    \t");
		 for(int i=0;i<5;i++)
		 {
			 System.out.print(Roll_No[i]+"\t");
		 }
		 System.out.println("");
		
		
		
		System.out.print("Student_Name\t");
		 for(int i=0;i<5;i++)
		 {
			 System.out.print(Student_Name[i]+"\t");
		 }
		 System.out.println("");
		 System.out.print("Gender      \t");
		 for(int i=0;i<5;i++)
		 {
			 System.out.print(Gender[i]  +"\t");
		 }
		 System.out.println("");
		 
		 System.out.print("Mobile_Number \t");
		 for(int i=0;i<5;i++)
		 {
			 System.out.print(Mobile_Number[i]+"\t");
		 }
		 System.out.println("");
	}
}
		 
	

