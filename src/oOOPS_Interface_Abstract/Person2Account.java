package oOOPS_Interface_Abstract;

public class Person2Account extends SavingAccount implements BankAccount,BasicBAccount  {

	public void deposit() {
		System.out.println("people can deposit check  through online");
		
	}
	public void withdrow() {
		System.out.println("people can withdrow  money from atm maximum of $1500");
		
	}
	public void transferMoney() {
		System.out.println("5% foreign transfer fee ");
		
	}
	public void credidcard() {
		System.out.println("people can have 2 card for nother user");
		
	}
	public void debitcard() {
		System.out.println("people can have debit card");
		
	}

}
