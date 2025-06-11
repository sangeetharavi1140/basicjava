package src.test.java;

import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,Object>h=new HashMap<String,Object>();	
		h.put("name","Anu");
		h.put("Age", 1);
		h.put("city", "bangalore");
	System.out.println(h.entrySet());
	System.out.println(h.keySet());
	System.out.println(h.values());
	System.out.println(h.get("name"));
	System.out.println(h.putIfAbsent("gender", "Female"));
	System.out.println(h.entrySet());
	System.out.println(h.replace("Age", 2));
	System.out.println(h.entrySet());
	
	
	}

}
