package sorting;

public class selectionsort {
	static void selsort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			//starting to i, array is sorted
			int minindex = i;
			for(int j=i+1;j<n;j++)
			{
				//find chhota element
				if(arr[j]<arr[minindex])
				{
					minindex=j;
				}
			}
			//keep chhota element at start
			int temp = arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
		}
	}
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,7,9,2,4};
		selsort(arr);
		print(arr);
		
	}

}
