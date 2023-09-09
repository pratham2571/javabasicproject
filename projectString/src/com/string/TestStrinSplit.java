package com.string;

import java.util.Scanner;

public class TestStrinSplit 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		String a[]=str.split(" ",8);
		
		for (String i:a)
			System.out.println(i);
	}
}
