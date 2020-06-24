package dp;

public class Fibonacci {
	static int fib(int n) //Recursive Approach
	{
		if(n==0 || n==1) return n;
		int a = fib(n-1);
		int b = fib(n-2);
//		fib(n) = fin(n-1) + fib(n-2); This is called State Expression
		int ans = a + b;
		return ans;
	}
	static int fibM(int n, int storage[]) //Memoizing
	{
		if(storage[n]!=0) return storage[n];// if already calculated means stored in array, so return
		if(n==0 || n==1) return n;
		int a = fibM(n-1,storage);
		int b = fibM(n-2,storage);
		int ans = a + b;
		storage[n] = ans; //store answer in the array
		return ans;
	}
	static int fibT(int n) //Tabulation
	{
		int storage[] = new int[n+1];
		storage[0] = 0;
		storage[1] = 1;
		for(int i = 2;i<=n;i++)
		{
			storage[i] = storage[i-1] + storage[i-2];
		}
		return storage[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 76;
		int storage[] = new int[n+1];
		long startTime = System.currentTimeMillis();
//		System.out.println(fib(n));
//		System.out.println(fibM(n,storage));
		System.out.println(fibT(n));
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: "+(endTime-startTime));
		
	}

}