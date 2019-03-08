public class AverageGenerics<T extends Number>
{
	T array[];
	int size;
	
	public AverageGenerics(T obj[])
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
}