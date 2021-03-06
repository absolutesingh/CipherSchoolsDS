package recursion;

public class BinarySearch {
	static int bSearch(int arr[],int l,int r, int x)
	{
		int mid=(l+r)/2;
		if(arr[mid]==x) return mid;
		if(x>arr[mid])
		{
			return bSearch(arr,mid+1,r,x);
		}
		if(x<arr[mid])
		{
			return bSearch(arr,l,mid-1,x);
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int fullName "Camel Casing"
		int arr[]={2,4,6,8,10};
		int x=8;
		System.out.println(bSearch(arr,0,arr.length-1,x));
	}

}
