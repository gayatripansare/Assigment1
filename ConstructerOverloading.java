public  class ConstructerOverloading
{
	int roll;
	int salry;
	String name;
		
        ConstructerOverloading()
	{
		roll=11;
		salry=15000;
		name="Hinata";
		System.out.println("The roll no is:"+roll+"The salry is:"+salry+"The name is:"+name+"The count is:");
	}
	
	ConstructerOverloading(int r)
	{
		roll=r;
		System.out.println("The roll no is:"+roll);
	}

	ConstructerOverloading(int r,int sal)
	{
		roll=r;
		salry=sal;
		System.out.println("The roll no is:"+roll+"The salry is:"+salry);
	}

 	ConstructerOverloading(int r,int sal,String n)
	{
		roll=r;
		salry=sal;
		name=n;
		System.out.println("The roll no is:"+roll+"The salry is:"+salry+"The name is:");
	}

	public static void main(String[] args)
	{
		ConstructerOverloading c1=new ConstructerOverloading();
		ConstructerOverloading c2=new ConstructerOverloading(100);
		ConstructerOverloading c3=new ConstructerOverloading(200,1300);
		ConstructerOverloading c4=new ConstructerOverloading(300,10000,"Anya");
	}


}
