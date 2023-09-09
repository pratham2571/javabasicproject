package com.string;

import java.util.Scanner;

public class TestCountCharacter 
{
	public static void main(String[] args) 
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String s=sc.nextLine();
		System.out.println("Enter 2nd string:");
		String s1=sc.nextLine();
		System.out.println("Total characters in 1st string="+s.length());
		System.out.println("Total characters in 2nd string="+s1.length());

		System.out.println("Total characters in 2 string="+(s.length()+s1.length()));
		
		char a[]=new char [s.length()];
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=s.charAt(i);
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(s.charAt(i)=='!')
				cnt++;
		}
		System.out.println("Total no of Punctuation="+cnt);
		
		
	}
}
