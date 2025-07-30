import java.util.*;
public class PrimrNo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Entr the number to check wheher it is prime or not:");
		int n=sc.nextInt();

		boolean isPrime=true;
		if(n<=1)
		{
			isPrime=false;
		}
		else
		{
			for(int i=2; i<=Math.sqrt(n); i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}

		}
		if(isPrime)
		{
			System.out.println("The number is prime!");
		}
		else
		{
			System.out.println("Number is NOT prime!");
		}
	}
}