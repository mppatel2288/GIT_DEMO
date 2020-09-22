package Data_Collection;

import org.testng.annotations.Test;

import Java_Basic.For_Loop;

public class Types_Array extends For_Loop {
	//static ArrayList ar = new ArrayList();
	public static void main(String[] args) {
	
		TwoDarray();
	}
	
	///////////////////////////////////SINGLE DIMENSION ARRAY/////////////////////////////////////////////
	@Test
	public static void  Intarray() {
		
		int i[] = new int [4];
		i[0]=2;
		i[1]=5;
		i[2]=9;
		i[3]=1;
	
		
		//System.out.println(i[2]);
		
		//System.out.println(i.length);
		for(int j=0; j<i.length;j++) {
			System.out.println(i[j]);
		}
		
	}

	public static void doublearray() {
		
		Double k[]= new Double [2];
		k[0]=2.5;
		k[1]=5.9;
		
		System.out.println(k[1]);
		
		}
		
	public static void chararray() {
	
		char k[]= new char [2];
		k[0]='A';
		k[1]='m';
		
		System.out.println(k[0]);
		
		}
		
	public static void Booleanarray() {
		
		boolean k[]= new boolean [2];
		k[0]=true;
		k[1]=false;
		
		System.out.println(k[1]);
		
		}
	
	
	public static void stringarray() {
		
		String k[]= new String [3];
		k[0]="AARTI";
		k[1]="MIHIR";
		k[2]="AAMI";
		
		System.out.println(k[2]);
		
		}
	
	///////////////////////////////////Multi DIMENSION ARRAY/////////////////////////////////////////////
	
	
public static void MultiDarray() {
		
		Object ob[]= new Object[5];
		
		ob[0]="AARTI";
		ob[1]=6;
		ob[2]=12.88;
		ob[3]= true;
		ob[4]='a';
		
		System.out.println(ob[0]);
		System.out.println(ob.length);
		
		}


///////////////////////////////////Multi DIMENSION ARRAY/////////////////////////////////////////////


public static void TwoDarray() {

String  [][] x= new String [3] [5];

x[0][0]="Mihir";
x[1][2]="Patel";
x[2][4]="Aarti";

System.out.println(x[1][3]);
System.out.println(x[2][4]);

for(int raw=0; raw<x.length; raw++) {
	for(int col=0;col<x.length;col++) {
		System.out.println(x[raw][col]);
	}
}

}

		
	}


 