package Java_Part2;

public class Global_Var {
	
	String name = "Aarti";
	int age = 24;
	

	public static void main(String[] args) {
		Mytest();
	}
	
	
	public static void Mytest() {
		Global_Var var = new Global_Var();
		
		String Lastname = "Patel";
		int mob=122334;
		
		
				
		System.out.println(Lastname);
		System.out.println(mob);
		
		System.out.println(var.name);
		System.out.println(var.age);
	}

}
