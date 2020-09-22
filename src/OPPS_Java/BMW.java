package OPPS_Java;

public class BMW extends car{

	public static void main(String[] args) {
		BMW bmw = new BMW ();
		bmw.start();
		 
 
	}

	
	public void thesafety() {
		
		System.out.println("TheSafety Method from BMW class");
	}
	
	public void start() {
		 System.out.println("Start Method from BMW class");
	}
	
	
	
}
