package src.test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Student> h=new HashSet<Student>();
		h.add(new Student("sam",101,"salem"));
		h.add(new Student ("hari",102,"cochin"));
		h.add(new Student("sangeetha",103,"bangalore"));
		System.out.println(h);
	
	Iterator<Student>	it=h.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	for(Student s:h)
	{
		System.out.println(s);
	}
	ArrayList<Student> a=new ArrayList<Student>(h);
	Collections.sort(a);
	System.out.println(a);
	Collections.reverse(a);
	System.out.println(a);
	}

}
