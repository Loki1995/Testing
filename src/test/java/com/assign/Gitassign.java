package com.assign;

public class Gitassign {
	String str1="dot was saw tod ";
	String str2="Is It ";
	String str3="dos was saw tod ";
	public void strfun()
	{
//		System.out.println(str2.concat(str1));
//		System.out.println(str1.toUpperCase());
//		System.out.println(str2.toLowerCase());
		
        // ~returns the index position
//		System.out.println(str1.indexOf("saw"));
		System.out.println(str3.compareToIgnoreCase(str1));
		
		
		
	}
	public static void main(String[] args)
	{
		Gitassign obj=new Gitassign();
		obj.strfun();
	}

}
