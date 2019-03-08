class Test <T extends Comparable<T>> implements MinMax<T>
{
	T arr[];
	public Test(T arr[])
	{
		this.arr=arr;
	}
	
	public T minValue()
	{
		T value=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(value.compareTo(arr[i])>0)
				value=arr[i];
		}
		return value;
	}
	
	public T maxValue()
	{
		T value=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(value.compareTo(arr[i])<0)
				value=arr[i];
		}
		return value;
	}
}