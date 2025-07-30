import java.util.*;
public class FBseries
{
	public static void main(String[] args)
	{
		int a=1;
		int b=2;
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=sc.nextInt();

		for(int i=3; i<=n; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
	
}
