package Data_Collection;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Table();
	}
	
	public static void Table() {
		
		  Hashtable<Integer, String> hashtable = new Hashtable<>();
	         
	        //2. Add mappings to hashtable 
	        hashtable.put(1,  "Aarti");
	      //  hashtable.put(1, "Nirav");
	        hashtable.put(2  ,"Mihir" );
	        hashtable.put(3,  "Aarti");
	        
	        
	      // System.out.println(hashtable.get(1));
	        
	        for(int i=1; i<=hashtable.size(); i++) {
	        	System.out.println(hashtable.get(i));
	        	
	        	System.out.println(hashtable.hashCode());
	        }
		
	}

}
