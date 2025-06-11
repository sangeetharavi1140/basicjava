package src.test.java;

import java.util.Scanner;

public class AdditionOfNuminString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter String value:");
		String str=s.next();
		int sum=0;
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			if(x>='0'&& x<='9')
			{
				sum=sum+(x-48);
			}
			else
			{
				temp=temp+x;
			}
		}
		System.out.println("sum:"+sum);
		System.out.println("String:"+temp);
	}

}
