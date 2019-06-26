package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.carLoan();
		hs.educationLoan();
		hs.mutualFund();
		
		
		USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		
		System.out.println(USBank.min_bal);

	}

}
