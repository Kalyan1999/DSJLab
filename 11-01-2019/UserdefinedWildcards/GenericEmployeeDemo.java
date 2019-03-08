public class GenericEmployeeDemo
{
	public static void main(String args[])
	{
		GovtEmployee gemp=new GovtEmployee("Raju",12000.50);
		CorpEmployee cemp=new CorpEmployee("Raju",12000.50);
		
		GenericEmployee<Employee> obj=new GenericEmployee<Employee>(gemp);
		GenericEmployee<Employee> obj1=new GenericEmployee<Employee>(cemp);
		
		if(obj.isSalaryEqual(obj1))
			System.out.println("Salaries are Equal");
		else
			System.out.println("Salaries are Not Equal");
	}
}