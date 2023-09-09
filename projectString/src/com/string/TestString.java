package com.string;

public class TestString 
{
	public static void main(String[] args) 
	{
		String name="Prathamesh";
		String name1=new String ("Vijay");
		char ch[]= {'p','r','a','t','h','a','m'};
		String name2=new String(ch);
		String name3="prathamesh";
		int a=30;
		
		name=name.concat(" Shinde");
		String p1="Shilpa";
		String p2="Pratiksha";
		String p3="Onkar";
		String p4=" Prathamesh ";
		String name4[]= {"Ajay","Vijay","Sanjay"};
		String str="Study Tonight";
		
		System.out.println(name+ " "+name1+" "+name2+" ");
		System.out.println(name);
		if(name.equals(name3))
			System.out.println("Equals:");
		else
			System.out.println("Not equal:");
		
		System.out.println(name==name3);
				
		
		if(name.equalsIgnoreCase(name3))
			System.out.println("Equals:");
		else
			System.out.println("Not equal:");
		
		System.out.println(name==name3);

		System.out.println(p1.compareTo(p2));
		System.out.println(p2.compareTo(p3));
		System.out.println(p1.compareTo(p4));
		System.out.println(p2.compareTo(p4));
		
		System.out.println(p4.substring(3));
		System.out.println(p4.substring(2,5));
		
		System.out.println(p4.toUpperCase());
		System.out.println(p4.toLowerCase());
		System.out.println(p4.trim());
		System.out.println(p4.startsWith("pra"));
		System.out.println(p4.endsWith("h"));
		
		for (int i = 0; i < name4.length; i++) 
		{
			System.out.println(name4[i].length());
		}
		
		System.out.println(str.indexOf('u'));
		System.out.println(str.indexOf('T', 3));
		String substring="Ton";
		System.out.println(str.lastIndexOf(substring));
		System.out.println(str.indexOf(substring, 7));
		
		System.out.println(p4.charAt(7));
		System.out.println(p4.intern());
		String s=String.valueOf(a);
		System.out.println(s+20);
		
	}
}
	