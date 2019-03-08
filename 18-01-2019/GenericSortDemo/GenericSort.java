public class GenericSort<T extends Number>
{
	T arr[];
	public GenericSort(T ob[])
	{
		arr=ob;
	}
	public void sortArray()
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j].doubleValue()>arr[j+1].doubleValue())
				{
					T p=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=p;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}