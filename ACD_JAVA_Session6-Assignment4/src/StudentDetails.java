import java.util.Scanner;

public abstract class StudentDetails {

	int roll_num;
	String name, reg_id;
	
	
	public void student_details(){}
	public void Marks(){}
}



class StudentResults extends StudentDetails
{
	int marks, percentage;
	
	Scanner ob = new Scanner(System.in);
	
	public void student_details()
	{
		System.out.println("Welcome to the Result Processing system...");
		System.out.println("Please enter the following details of the student: ");
		System.out.println("Name: ");
		 name = ob.next();
		System.out.println("Roll number: ");
		roll_num = ob.nextInt();
		System.out.println("Registration ID");
		 reg_id = ob.next();
		
		
	}
	
	public void Marks()
	{
		System.out.println("Enter the marks of the 3 subjects of the student: ");
		int sub1 = ob.nextInt();
		int sub2 = ob.nextInt();
		int sub3 = ob.nextInt();
		
		
		double percentage = 100*((sub1+sub2+sub3)/150);
		
		System.out.println("The percentage of "+name+" is: "+percentage);
	}
	
	
}