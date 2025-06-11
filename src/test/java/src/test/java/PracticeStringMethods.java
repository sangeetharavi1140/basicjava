package src.test.java;

public class PracticeStringMethods {  
	public static void main(String[] args) {
		String a1=new String("salem");
		String a="salem";
		System.out.println(a);
		System.out.println(a==a1);//comparing the reference address
		System.out.println(a.equals(a1));//comparing the value 
		String b="anushree";
		String c="anushree";
		System.out.println(b==c);//reference address is same
		b="anu";
		System.out.println(b==c);//reference address is different
		
	}

}
