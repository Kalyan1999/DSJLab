public class GenericEmployee<T extends Employee>
{
	T emp;
	
	public GenericEmployee(T emp)
	{
		this.emp=emp;
	}
	
	public boolean isSalaryEqual(GenericEmployee<?> other)
	{
		if(other.emp.getSalary()==emp.getSalary())
			return true;
		else
			return false;
	}
}