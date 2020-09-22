package Java_Basic;

public class Diff_Operator {

	public static void main(String[] args) {
		Myoperators();
		Compare();
	}
	
	public static void Myoperators () {
		
		
		int a = 10;
		int b = 20;
		
		if(a ==b) {
			
			System.out.println("A is Equal to B");
		}
		else{
			System.out.println("A is Not Equal to B");
		}
		
		
	}
	
	
	
	
	public static void Compare() {
		
		int a = 20;
		int b = 300;
		int c = 40;
		
		if(a>b & a>c) {
			
			System.out.println("A is Bigger");
			
		}
		if(b>c) {
			System.out.println("B is Bigger");
		}
		else {
			System.out.println("C is Bigger");
		}
	}

}
