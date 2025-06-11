package src.test.java;

import java.util.Scanner;

public class FindAllVowelsinString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=s.next();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
			{
				System.out.println(x+"is vowel");
				count++;
			}
		}
		System.out.println("total vowels :"+count);
	}

}
