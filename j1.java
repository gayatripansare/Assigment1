import java.util.Scanner;
public class j1
{
public  static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);

int a[]=new int[5];
for(int i=0; i<5; i++)
{
 System.out.print("Enter the element:");
 a[i]=sc.nextInt();
}

int sum=0;
for(int i=0; i<5; i++)
{
 sum +=a[i];

}

System.out.println("The sum of 5 num is :"+sum);

}

}