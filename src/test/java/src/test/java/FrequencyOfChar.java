package src.test.java;

public class FrequencyOfChar {
public static void main(String[] args) {
	String str="sangeetha";
	String str1="417";
	int count=0;
	char ch='a';
	for(int i=0;i<str.length();i++)
	{
		char x=str.charAt(i);
		if(ch==x)
		{
			count++;
		}
	}
	System.out.println(count);
	int n=Integer.parseInt(str1);
	System.out.println(n);
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb);
}
}
