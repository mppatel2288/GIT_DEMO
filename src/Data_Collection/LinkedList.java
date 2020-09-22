package Data_Collection;

import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		LinkList();
	}
	
	
	public static void LinkList() {
		
		java.util.LinkedList<String> ll = new java.util.LinkedList<String>();
		
		ll.add("AAAAAA");
		ll.add("BBBBB");
		ll.add("CCCCCCC");
		ll.add("DDDDDDD");
		ll.addFirst("Aarti");
	    ll.addLast("Patel");
	    ll.set(3, "Bhumi");	
	    
	    
		//System.out.println(ll);
	    
	    //Using For loop
		
//		for(int i=0; i<ll.size(); i++) {
//			System.out.println(ll.get(i));
//		}
		
		
		// Using Advance For Loop
		
//		for (String str:ll) {
//			System.out.println(str);
//		}
		
//		
//		Iterator<String> it = ll.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
	    int num = 0;
	    
	    while(ll.size()> num) {
	    	System.out.println(ll.get(num));
	    	num++;
	    }
	    
	}

}
