package Data_Collection;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.parser.Entity;

public class HashMap_Concept {

	public static void main(String[] args) {
		Mymap();

	}



	public static void Mymap() {
		Map<Integer, String> hm = new HashMap<Integer,String>();

		hm.put(1, "Papa");
		hm.put(2, "Mom");
		hm.put(3,"Aarti");
		hm.put(9, "Mihir");
		hm.put(9, "Nirav");
 
		//System.out.println(hm.remove(9));
		//System.out.println(hm.get(5));

		for(java.util.Map.Entry<Integer, String> m:hm.entrySet()) {

			System.out.println(m.getKey() + "--->" + m.getValue());

		}
	}


}