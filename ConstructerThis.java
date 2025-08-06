import java.util.*;
public class ConstructerThis
{
	int emp_id;
	String name;
	int salry;
	ConstructerThis(int emp_id,String name, int salry)
	{
		this.emp_id=emp_id;
		this.name=name;
		this.salry=salry;
	}

	void display()
	{
		System.out.println("The name is:"+name+"And the id is:"+emp_id+"The salry is:"+salry);
	}

	public static void main(String[] args)
	{
		ConstructerThis c=new ConstructerThis(12,"Hinata",1200);
		c.display();


	}
}