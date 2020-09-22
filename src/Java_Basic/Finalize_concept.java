package Java_Basic;

public class Finalize_concept {

	public static void main(String[] args) {
		Test();
	}

	
	public static void Test () {
		
		 int i = 10;
		try {
			int k = i/0;
			System.out.println("Try Block is here");
		}
		catch(NullPointerException E){
			System.out.println("Something is not correct in Array");
			
		}
		
		finally {
			
			int a=10;
			int b= 20;
			System.out.println("My output is here------->>>>>>"   +    (a+b));
		}
	}
}
 