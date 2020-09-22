package Java_Part2;

public class Java_func {
	
	
	

	public static void main(String[] args) {
		Myresult1();

	}

    
	
	public static void Myresult() {
		Java_Function jvfun = new Java_Function();
		int a = jvfun.pqr();  //x+y
		
		int b = a+20;
		
		System.out.println(b);
		
	
	}
	
	public static void Myresult1() {
		Java_Function jvfun = new Java_Function();
		int a = jvfun.xyz(20, 30);  //x+y
		
		int b = a+20;
	
		System.out.println(b);
		
	
	}
}
