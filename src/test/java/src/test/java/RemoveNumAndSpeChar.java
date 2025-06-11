package src.test.java;

import java.util.Scanner;

public class RemoveNumAndSpeChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter String value:");
		String str=s.next();
		String temp=" ";
		for(int i=0;i<str.length();i++)
			{
			char c=str.charAt(i);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
{temp=temp+c;
	}
	}
		System.out.println(temp);}
}
