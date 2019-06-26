package JavaBasics;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		//HashMap is a class that implements Map Interface
		//extends Abstract Map
		//it contains only unique elements
		// It has one null key and multiple null values
		//It maintains no order
		//hashmap is non synchronized -- not thread safe
		//concurrent modification exception -- Fail-Fast condition
		

		HashMap<Integer,String> h = new HashMap<Integer,String>();
		
		h.put(1, "Selenium");
		h.put(2, "QTP");
		h.put(3, "Test Complete");
		h.put(4, "RFT");
		
		System.out.println(h.get(2));
		
		for(Entry m : h.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		System.out.println(h);
		h.remove(3);
		System.out.println(h);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 25, "Admin");
		Employee e2 = new Employee("Peter", 26, "QA");
		Employee e3 = new Employee("Steve", 27, "Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer,Employee> m1 : emp.entrySet()) {
			int key = m1.getKey();
			Employee e = m1.getValue();
			System.out.println(key +" Info ");
			
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
		
		
		
		
	}

}
