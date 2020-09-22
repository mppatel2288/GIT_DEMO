package Data_Collection;

import org.omg.CORBA.CurrentHolder;

public class Constructor_Concept {

	
	 String name ;
	 int age;
	 
	public static void main(String[] args) {
		Constructor_Concept cl = new Constructor_Concept("AARTI", 24);

		System.out.println(cl);

	}

	
//	public Constructor_Concept(int i) {
//	System.out.println(i);
//		
//	}
	
	public Constructor_Concept(String name, int age) {
		
		
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
		
	}
}
