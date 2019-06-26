package JavaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add(true);
		ar.add(12.45);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
			
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(600);
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("John");
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		Employee e1 = new Employee("Naveen",27,"QA");
		Employee e2 = new Employee("Tom",28,"Dev");
		Employee e3 = new Employee("John",29,"Admin");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("DEV");
		ar6.add("Java");
		ar6.add("Javascript");
		ar6.add("test");
		
		
		
		ar5.addAll(ar6);
		
		for(int j=0;j<ar5.size();j++) {
			System.out.println(ar5.get(j));
		}
		
		/*ar5.removeAll(ar6);
		
		for(int k=0;k<ar5.size();k++) {
			System.out.println(ar5.get(k));
		}*/
		
		ar5.retainAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
					
		
	}

}
