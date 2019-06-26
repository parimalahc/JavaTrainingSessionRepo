package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{//"Is-a relationship"

	
		
		public void credit(){
			System.out.println("HSBCBank---credit");
		}

		public void debit(){
			System.out.println("HSBCBank---debit");
		}
   
		public void transferMoney() {
			System.out.println("HSBCBank---transferMoney");
		}
		
		public void educationLoan() {
			System.out.println("HSBCBank---educationLoan");
		}
		
		public void carLoan() {
			System.out.println("HSBCBank---carLoan");
		}
		
		public void mutualFund() {
			System.out.println("HSBCBank---mutualFund");
		}
}
