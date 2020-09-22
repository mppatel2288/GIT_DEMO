package OPPS_Java;

public class ICIC_Bank implements US_Bank,Brazil_Bank {

	public static void main(String[] args) {
		ICIC_Bank icb = new ICIC_Bank();
		icb.Credit();

	}

	public void Credit() {
		
System.out.println("This is a Credit Method");
		
	}

	public  void debit() {
		System.out.println("This is a Debit Method");
	}

	public void transfermoney() {
		System.out.println("This is a transferMoney Method");
	}
	
	public void eductionLoan() {
		System.out.println("This is a educationLoan Method");
	}
	
	public void carLoan() {
		System.out.println("This is a carLoan Method");
	}


	public void checkDeposite() {
		System.out.println("This is a checkDeposite Method");
		
	}

	
	public void matualFund() {
		System.out.println("This is a matualFund Method");
	}
	

}
