package Java_Part2;

public class Call_by_reference {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		Call_by_reference cv = new Call_by_reference();
		
	 cv.p = 20;
	 cv.q = 30;
	 testbyvalue(cv);
	 
	 swap(cv);
	 System.out.println(cv.p);
	 System.out.println(cv.q);
	}

	
	
	public static int testbyvalue(Call_by_reference a) {
		
		
	int c = a.p+a.q;
	System.out.println(c);
	return c;
		
	}
	
	
	public static int swap(Call_by_reference a) {
		
		int z = 0;
		
		z = a.p;
		a.p =a.q;
		a.q = z;
		System.out.println(z);
		return z;
	}
}
