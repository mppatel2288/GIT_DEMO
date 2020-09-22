package Java_Part2;

public class Call_By_Value {
	
	
       
       
       
	public static void main(String[] args) {
		
		int x = 12;
	    int y =20;
		
		Call_By_Value cl = new Call_By_Value();
	    cl.testsum1(x,y);

	}
	
	
	public int testsum (int a , int b) {
		
		int c = a+b;
		System.out.println(c);
		return c;
		
	}
	
	public int testsum1(int a, int b) {
		
		System.out.println(a);
		System.out.println(b);
		
		a =20;
		b =30;
		int c = a+b;
		System.out.println(c);
		return c;
		
		
		
	}

	
	
}
