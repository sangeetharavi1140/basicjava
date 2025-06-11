package src.test.java;

public class Student implements Comparable<Student>{
	String name;
	int sid;
	String city;
	//constructor
	public Student(String name,int sid,String city)
	{
		this.name=name;
		this.sid=sid;
		this.city=city;
		
	}
	public String toString()
	{
		return name+" "+sid+" "+city;
	}
	public int compareTo(Student s)
	{
		if(this.name.compareTo(s.name)>0)
		return 1;
		else if(this.name.compareTo(s.name)<0)
			return -1;
		else
			return 0;
			
		
	}

}
