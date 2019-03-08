public class WildcardAverage<T extends Number>
{
	T array[];
	int size;
	
	public WildcardAverage(T obj[])
	{
		array=obj;
		size=obj.length;
	}
	
	public double average()
	{
		double sum=0.0;
		
		for(int i=0;i<size;i++)
		{
			sum+=array[i].doubleValue();
		}
		
		return (sum/size);
	}
	
	public boolean sameAvg(WildcardAverage<?> obj)
	{
		if(this.average()==obj.average())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}