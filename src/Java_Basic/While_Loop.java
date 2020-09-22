package Java_Basic;

public class While_Loop {

	public static void main(String[] args) {
		WithoutLoopConcept();
		LoopConcept();
	}
	
	public static void WithoutLoopConcept() {
		
		System.out.println("Enter 1");
		System.out.println("Enter 2");
		System.out.println("Enter 3");
		System.out.println("Enter 4");
		System.out.println("Enter 5");
	}
	
	public static void LoopConcept() {
		
		int i =10; // Intialization 
		
		while(i>=1){  //Condition
			System.out.println(i); //Increment - Decrement
			i= i-1;
		}
	}
}
