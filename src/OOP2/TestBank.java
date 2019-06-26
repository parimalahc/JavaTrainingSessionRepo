package OOP2;

public class TestBank {

	public static void main(String[] args) {
		
		
		ICICIBank ic = new ICICIBank();
		ic.credit();
		ic.debit();
		ic.transferMoney();
		
		ic.educationLoan();
		ic.carLoan();
		ic.homeLoan();
		
		ic.mutualFunds();
		ic.insurance();
		ic.stock();
		
		System.out.println(USBank.min_bal);
		
		USBank us = new ICICIBank();
		us.credit();
		us.debit();
		us.transferMoney();
		us.trading();
		

	}

}
