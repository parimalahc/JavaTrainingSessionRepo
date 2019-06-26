package JavaBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("test");
		ll.add("QTP");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		System.out.println("contents of the linked list:" +ll);

		ll.addFirst("Naveen");
		ll.addLast("Automation");
		
		System.out.println("contents of the linked list:" +ll);
		
		System.out.println(ll.get(0));
		
		ll.set(0, "Tom");
		
		System.out.println(ll.get(0));
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("contents of the linked list:" +ll);
		
		ll.remove(2);
		System.out.println("contents of the linked list:" +ll);
		
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		for(String str : ll) {
			System.out.println(str);
		}
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		int num =0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
	}

}
