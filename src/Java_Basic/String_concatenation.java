package Java_Basic;

public class String_concatenation {

	public static void main(String[] args) {
		
		summation();
	}

	public static void summation() {
		
		int a = 100;
		int b= 300;
		
		String x = "HELLO";
		String y = "AARTI";
		
		//int c = a+b;
		System.out.println("My result is 1---->>>"+  a+b);
		System.out.println("My result is 2 ---->>>"+  (a+b));
		System.out.println("My result is 3---->>>"+  x+y+(a+b));
		System.out.println("My result is 4---->>>"+  (x+y)+(a+b));
	}
	
}
