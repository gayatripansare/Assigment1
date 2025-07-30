import java.util.*;
public class fact
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the num to find factoral:");
int num=sc.nextInt();
int i=1;
int fact=1;
while(i<=num)
{
  fact *=i;
  i++;
}
System.out.println("The factorial is :"+fact);

}

}