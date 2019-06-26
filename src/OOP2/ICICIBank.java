package OOP2;

public class ICICIBank extends Finance implements USBank, RBI{

	@Override
	public void educationLoan() {
		System.out.println("ICICI---Education Loan");
		
	}

	@Override
	public void carLoan() {
		System.out.println("ICICI----Car Loan");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("ICICI----Home Loan");
		
	}

	@Override
	public void credit() {
		System.out.println("ICICI----Credit");
		
	}

	@Override
	public void debit() {
		System.out.println("ICICI----Debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("ICICI----Transfer Money");
		
	}

	@Override
	public void trading() {
		System.out.println("ICICI----Trading");
		
	}

	public void mutualFunds() {
		System.out.println("ICICI----Mutual funds");
	}
	
    public void insurance() {
    	System.out.println("ICICI----Insurance");
    }
}
