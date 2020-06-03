package stacks;

import java.util.*;
import java.lang.*;
import java.io.*;

class evaluatePostfixx {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t>0)
		{
		    String s=sc.nextLine();
		    System.out.println(postfixEvaluate(s));
		    t--;
		}
	}
	static int postfixEvaluate(String s)
	{
	    Stack<Integer> st = new Stack<>();
	    for(int i=0;i<s.length();i++)
	    {   char c = s.charAt(i);
	        if(Character.isDigit(c))//checks if c is b/w 0 &9
	        {
	            st.push(c-'0');
	        }
	        else{
	            int val2 = st.pop();
	            int val1 = st.pop();
	           // int res = solve(c,val1,val2);
	           // st.push(res);
	            switch(c)
	            {
	                case '*':
	                    st.push(val1*val2);
	                    break;
	                case '+':
	                    st.push(val1+val2);
	                    break;
	                case '-':
	                    st.push(val1-val2);
	                    break;
	                case '/':
	                    st.push(val1/val2);
	                    break;
	            }
	        }
	    }
	    return st.pop();
	}
	static int solve(char c, int val1, int val2)
	{
	    if(c=='*') return val1*val2;
	    if(c=='+') return val1+val2;
	    if(c=='-') return val1-val2;
	    if(c=='/') return val1/val2;
	    return 0;
	}
}