package dp;

public class CountSteps {
	static int findStep(int n)
	{
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		return findStep(n-1) + findStep(n-2) + findStep(n-3);
	}
	static int findStepM(int dp[], int n)
	{
		if(n==0) return 1;
		if(n==1) return 1;
		if(n==2) return 2;
		if(dp[n]!=0) return dp[n];
		dp[n] = findStepM(dp,n-1) + findStepM(dp,n-2) + findStepM(dp,n-3);
		return dp[n];
	}
	static int findStepT(int n)
	{
		int dp[] = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		System.out.println(findStep(n));
		int dp[] = new int[n+1];
//		System.out.println(findStepM(dp,n));
		System.out.println(findStepT(n));
	}

}