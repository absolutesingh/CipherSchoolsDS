package stacks;
import java.util.*;
import java.lang.*;
import java.io.*;

public class balancedParenthesis {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		while(t>0)
		{
		    String s=sc.nextLine();
		    if(checkParenthesis(s))
		    {
		        System.out.println("balanced");
		    }
		    else{
		        System.out.println("not balanced");
		    }
		    t--;
		}
	}
	static boolean checkParenthesis(String s)
	{
	    if(s.length()%2 != 0) return false;
	    Stack<Character> st = new Stack<>();
	    for(int i=0;i<s.length();i++)
	    {
	        char c = s.charAt(i);
	        if(c=='{' || c=='[' || c=='(')//when c is opening bracket
	        {
	            st.push(c);
	        }
	        if(c=='}' || c==']' || c==')')//when c is closing bracket
	        {
	            if(st.isEmpty()) return false;
	            char ch = st.pop();
	            //if matching pair not found return false
//	            if((c=='}' && ch!='{') ||
//	               (c==']' && ch!='[') ||
//	               (c==')' && ch!='(')
//	            ) return false;
	            if(!matchingPair(c,ch)) return false;
	        }
	    }
	    if(st.isEmpty()) return true;
	    return false;
	}
	static boolean matchingPair(char c, char ch)
	{
	    if(c=='}' && ch=='{') return true;
	    if(c==')' && ch=='(') return true;
	    if(c==']' && ch=='[') return true;
	    return false;
	}
}
