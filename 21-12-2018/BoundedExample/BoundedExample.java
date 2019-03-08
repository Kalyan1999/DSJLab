import java.lang.*;

public class BoundedExample<T extends Number>
{
	T array[];
	int size;
	public BoundedExample(T obj[])
	{
		array=obj;
		size=obj.length;
	}
	public double average()
	{
		Double sum=0.0;
		for(int i=0;i<array.length;i++)
			sum+=array[i];
		return (sum/size);
	}
}