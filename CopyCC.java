public class CopyCC
{
		int emp_id;
		int salary;
		String name;
	CopyCC(int id,int sal,String n)
	{
		 emp_id=id;
		salary=sal;
		name=n;
		System.out.print("The name is: "+name+" Id is :"+id+" Tje salary is: "+salary);
	}

	CopyCC(CopyCC obj)
	{
		 id=obj.id;
		salary=obj.sal;
		name=obj.n;
		System.out.print("The name is: "+name+" Id is :"+id+" Tje salary is: "+salary);
	}

	public static void main(String[] args)
	{
	CopyCC s=new CopyCC(101,100000,"Hinata");
	CopyCC s1=new CopyCC(s);

	}


}
