public class SumBoundedtype<T extends Number>
{
	T a,b;
	public SumBoundedtype(T a,T b)
	{
		this.a=a;
		this.b=b;
	}
	
	public double sum()
	{
		return (a.doubleValue()+b.doubleValue());
	}
}