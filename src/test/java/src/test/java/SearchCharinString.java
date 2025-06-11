package src.test.java;

public class SearchCharinString {
public static void main(String[] args) {
	String str="sangeetha";
	char c='a';
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		char x=str.charAt(i);
		if(c==x)
		{
			count++;
			System.out.println(count);
		}
	}
	if(count==1)
	
	System.out.println(c+"is present");
	
}
}
