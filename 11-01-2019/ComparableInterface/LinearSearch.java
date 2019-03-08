public class LinearSearch
{
	public <T extends Comparable<T>,V extends T> boolean isIn(T arr[],V ele)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(ele.equals(arr[i]))
				return true;
		}
		return false;
	}
}