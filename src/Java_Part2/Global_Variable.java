package Java_Part2;

public class Global_Variable {

	int mod; 
	int wheel;
	
	
	Global_Variable a = new Global_Variable();
	Global_Variable b = new Global_Variable();
	Global_Variable c = new Global_Variable();
	
	
	
	public static void main(String[] args) {
		Global_Variable z = new Global_Variable();
		z.car ();
	}
	
	public void  car () {
		
		Java_Function jv = new Java_Function();
				
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2013 ;
	    c.wheel=4;
	
	}
}
