package src.test.java;

import java.util.Scanner;

public class ExforUpperandLower {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter value:");
		String str=s.next();
		String temp=" ";
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			if(x>='a'&&x<='z')
			{
				temp=temp+(char)(x-32);
			}
			else
			{
				temp=temp+(char)(x+32);
			}
		}
		System.out.println(temp);
	}

}
