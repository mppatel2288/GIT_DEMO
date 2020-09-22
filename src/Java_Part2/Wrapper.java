package Java_Part2;

public class Wrapper {

	public static void main(String[] args) {
		
		inttoString();
	}
	
	public static void datacon() {
		
		String x = "100";
		
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		
		System.out.println(i);
		
		System.out.println(i+20);
		
		String y = "12.765";
		
		double d = Double.parseDouble(y);
		System.out.println(d);
		String z ="True";
		Boolean b = Boolean.parseBoolean(z);
		System.out.println(b);
		
	}
	
	
	public static void inttoString() {
		
		int i = 9;
		System.out.println(i+11);
		
	String s = String.valueOf(i);
	
	System.out.println(s+11);
	
		
		
	}

}
