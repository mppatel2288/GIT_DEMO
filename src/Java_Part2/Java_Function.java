package Java_Part2;

public class Java_Function {

	public static void main(String[] args) {
		
		Java_Function jvfun = new Java_Function();
		//Test();
		//jvfun.pqr();
		jvfun.xyz(11, 22);

		
	}
	
	
	public static void Test() {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("My Result is ------>>>>"+ c);
		
	}
	
	
  public  int pqr() {
		
		int x = 12;
		int y= 20;
		int z = x+y;
		System.out.println(z);
		return z;
		
  }
  
  public int xyz(int a, int b) {
	  
	  int c= a+b;
	  System.out.println(c);
	return c;
	  
	  
  }

}
