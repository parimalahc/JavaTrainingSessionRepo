package JavaBasics;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//It is similar to HashMap but it is synchronized
		//stores the value on the basis of key-value pair
		//key-->Object--HashCode--->value


		Hashtable h = new Hashtable();
		
		h.put(1,"tom");
		h.put(2,"John");
		h.put(3,"Henry");
		
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable) h.clone();
		
		
		System.out.println("values from h:" +h);
		System.out.println("values from h2:" +h2);
		
		h.clear();
		System.out.println("values from h:" +h);
		System.out.println("values from h2:" +h2);
		
		
		Hashtable st = new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.contains("Naveen")) {
			System.out.println("value is found");
			
		}
		
		Enumeration e = st.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
		Set s = st.entrySet();
		System.out.println(s);
		
		Hashtable st1 = new Hashtable();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium");
		
		System.out.println(st1);
		
		if(st.equals(st1)) {
			System.out.println("both are equal");
		}
		
		
		System.out.println(st.get("A"));
		
		System.out.println(st1.hashCode());
		
		System.out.println(h.get(2));
		
		System.out.println(h.size());
		
		
		h.put(4, "Cat");
		
		System.out.println(h.size());
		
		Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();
		
		h1.put(5, "Jill");
	}

}
