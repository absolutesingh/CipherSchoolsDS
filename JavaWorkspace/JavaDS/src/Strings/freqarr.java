package Strings;

import java.util.Scanner;

public class freqarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int fa[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
//			char c = s.charAt(i);
//			int index=(int)c-97;
//			int index=(int)c-'a';
//			int index=c-'a';
//			fa[index]=fa[index]+1;
			int index=s.charAt(i)-'a';
			fa[index]++;
//			fa[s.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++)
		{
			System.out.print(fa[i]+" ");
		}
	}

}
