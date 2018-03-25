package oOOPS_Interface_Abstract;

public class PersonAccount extends CurrentAccount implements BankAccount,BasicBAccount{


	public void deposit() {
		System.out.println("people can deposit money");
		
	}

	public void withdrow() {
		System.out.println("people can withdrow  money from atm maximum of $1100");
			
	}

	public void transferMoney() {
		System.out.println("3% foreign trnsfer fee");
			
	}
	public void debitcard() {
		System.out.println("acocount holder chave credit card");
	}
	
	public void credidcard() {
		System.out.println("acocount holder can have credit card");
		
	}

}


