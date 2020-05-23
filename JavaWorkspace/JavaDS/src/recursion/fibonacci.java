package recursion;

import java.util.Scanner;

public class fibonacci {
	static int fib(int n)
	{
		if(n<=1) return n;
		return fib(n-1)+fib(n-2);
//		int a = fib(n-1);
//		int b = fib(n-2);
//		int sum=a+b;
//		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
	}

}
