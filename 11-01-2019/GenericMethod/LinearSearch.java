public class LinearSearch
{
	public <T> boolean isIn(T arr[],T ele)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(ele.equals(arr[i]))
				return true;
		}
		return false;
	}
}