package Java_Part2;

public class Static_Non_Static {
	
	
	String s = "Mihir";      //Non- static
    static int age = 26;    //static


	public static void main(String[] args) {
		
		Static_Non_Static st = new Static_Non_Static();
		summer();
		System.out.println(age);
	}
	
	public void sendmail() {
		
		System.out.println("My Non-Static Method");
	}

	public static  int summer() {
		
		System.out.println("This is my static method");
		
		return (Integer) null;
	}
}
