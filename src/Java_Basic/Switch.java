package Java_Basic;

public class Switch {

	public static void main(String[] args) {
		Switch sw = new Switch();
		sw.switchCase();
		
	}
	
	
	public void switchCase() {
		
		int day = 8;
		
		switch (day) {
		
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursady");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
			System.out.println("Today Is Holiday");
			    break;
		}

}
	

	}
	
