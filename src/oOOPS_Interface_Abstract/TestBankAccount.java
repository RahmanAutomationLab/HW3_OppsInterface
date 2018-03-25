package oOOPS_Interface_Abstract;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount ac=new PersonAccount();
				ac.deposit();
				ac.withdrow();
				ac.transferMoney();
				
				PersonAccount account=new PersonAccount();
		        account.debitcard();
		        account.credidcard();
		        
		        CurrentAccount ac1=new PersonAccount();
		        ac1.serviceFree();
		        ac1.accountbal();
		        
		        BankAccount ba2=new Person2Account();
		        ba2.transferMoney();
		        ba2.withdrow();
		        SavingAccount sa=new Person2Account();
		        sa.MinBal();
		 
	
	}

}
