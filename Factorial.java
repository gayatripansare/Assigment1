import java.util.*;

class facta
{
int fact=1;
public int  result(int num)
{
if(num>=1)
{
fact *=num;
num--;
}
result(num);
}
return fact;
}

public class Factorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the numer:");
int num=sc.nextInt();
facta fc=new facta();
int re=fc.result(num);
System.out.println("the resullt is:"+re);

}


} 

}