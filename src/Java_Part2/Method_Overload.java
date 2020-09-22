package Java_Part2;

public class Method_Overload {

	public static void main(String[] args) {
		
		Method_Overload load = new Method_Overload();
		
		load.sum(10,20);
	}
	
	public  void sum() {
		System.out.println("This is My first Method");
		
	}
	
	public void sum(int i) {
		System.out.println("This is My Second Method");
		
	}
	public void sum(int i, int k ) {
		System.out.println("This is My Third Method");
		
	}

}
