package OPPS_Java;

public class HDFC_Bank {

	public static void main(String[] args) {
		
	//	ICIC_Bank icb = new ICIC_Bank();
	//	icb.debit();
	//	icb.Credit();
	//	icb.transfermoney();
	
		HDFC_Bank hdfc = new HDFC_Bank();
		
		hdfc.TestPoly();
	}
	
	public void TestPoly() {
		
		US_Bank ub = new ICIC_Bank();
		
		ub.Credit();
		ub.debit();
		ub.transfermoney();
	}
}
