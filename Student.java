import java.util.*;
public class Student
{
	int roll_no;
	String name;

		Student()
			{
					roll_no=12;
					name="Hinata";
					
					System.out.println("Student Information:");
					System.out.println("The roll No is :"+roll_no+" The name is :"+name);
			}

		Student(int r,String n)
		{
			roll_no=r;
			name=n;
			System.out.println("Student Information:");
			System.out.println("The roll No is :"+roll_no+" The name is :"+name);
		}

		public static void main(String[] args)
		{
			Student s=new Student();
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the roll_no:");
			int r=sc.nextInt();
			System.out.print("Enter the name:");
			String n=sc.next();
			Student s1=new Student(r,n);
		}
}