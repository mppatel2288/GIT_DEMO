package Data_Collection;

import java.awt.List;

public class ArrayList {

	public static void main(String[] args) {
		listArray();

	}
	
	
	public static void listArray() {
		
		ArrayList ar = new ArrayList();
		
//		ar.add("Aarti");
//		ar.add(23);
//		ar.add(true);
//		ar.add(12.33);
		
		
	java.util.ArrayList<String> an = new java.util.ArrayList<String>();
	
	an.add("Aarti");  //0
	an.add("Mihir");  //1
    an.add("Mom");   //2
    an.add("Papa");  
    
    
java.util.ArrayList<String> ab = new java.util.ArrayList<String>();
	
	ab.add("Aarti");  //0
	ab.add("Mihir");  //1
   
	
    
java.util.ArrayList<String> ind = new java.util.ArrayList<String>();
	
	ind.add("Guj");  //0
	ind.add("Pun");  //1
    ind.add("JK");   //2
    ind.add("UP");  //3
    
   // ind.addAll(an); 
   // ind.removeAll(ab);
                 
    
    
    for (int i =0; i<ind.size(); i++) {
    	System.out.println(ind.get(i));
    	
    }
		
	}

	
	
}
