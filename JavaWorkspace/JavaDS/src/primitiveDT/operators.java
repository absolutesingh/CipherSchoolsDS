package primitiveDT;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 6;
		int c = a + b;
		System.out.println(c);
		//Remainder - modulus operator %
		int remainder = 5%3;
		System.out.println(remainder);
		System.out.println(5/6);
		System.out.println(6/5);
		//Implicit Type Casting/Widening/UpCasting
		byte x = 127;
		int temp = x;
		System.out.println(temp);
		//Explicit Type Casting/Narrowing/Down-Casting
		int m = 130;
		byte n =(byte)m;
		System.out.println(n);
		
		double d = 5.0;
		int q = (int)d;
		System.out.println(d);
		System.out.println(q);
		
		int x1 = 5;
		int x2 = 5;
		int y1 = ++x1;
		int y2 = x2++;
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(x1);
		System.out.println(x2);
		
		//Find the greater of 2 Numbers
		int a1 = 3;
		int a2 = 2;
		if(a1>a2)
		{
			System.out.println("A1 is greater: "+a1);
		}
		else{
			System.out.println("A2 is greater: "+a2);
		}
		
//		int temp2 = 5;
//		if(5%2 == 1)
//		{
//			System.out.println("Odd");
//		}
		int salary = 600000;
		if(salary > 500000)
		{
			salary = salary*90/100;
		}
		System.out.println(salary);
		
		
		int first = 10;
		int second = 3;
		int third = 5;
		//Nested if-else
		if(first>second)//second cannot be largest
		{
			if(first>third)
			{
				System.out.println("First is greatest: "+first);
			}
			else
			{
				System.out.println("Third is greatest: "+third);
			}
			
		}
		else//first cannot be largest
		{
			if(second>third)
			{
				System.out.println("Second is greatest: "+second);
			}
			else{
				System.out.println("Third is greatest: "+third);
			}
		}
		
		

	}

}
