package Java_Basic;

public class Post_and_Pri_Increment {

	public static void main(String[] args) {
		PostDecrement();

	}
	
	public static void PostIncrement(){
  	  
  	  int i = 2;
  	  int j = i++;
  	  
  	  System.out.println(i);
  	  System.out.println(j);
    }
	
	public static void PostDecrement(){
		
		
		int m = 4;
		int n = m--;
		System.out.println(m);
	  	  System.out.println(n);
	}

	
public static void PreDecrement(){
		
		
		int p =4;
		int q = --p;
		System.out.println(p);
	  	System.out.println(q);
	  	  
	}
}
