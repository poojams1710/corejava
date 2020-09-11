package day5;

public class Banking {
	int AccountNumber;
	int TotalBalance;
	
	
	public Banking(int AccountNumber, int TotalBalance) {
		
		this.AccountNumber = AccountNumber;
		this.TotalBalance = TotalBalance;
	}

	
	
	void deposit(int depositamount) {
		
		System.out.println("your account  have added this much more  " + depositamount);
		
	}
	
	void withdraw(int withdrawalBalance) {
		System.out.println("your account u withdrwal recently   " +withdrawalBalance);
		
	}
	
	void getBalance(int accountNumber, int totalBalance) {
		System.out.println("your account balance number   "+accountNumber +"   and totalbalnce" +totalBalance);
		
	}

}

class CheckingAccount extends Banking{
	int fee;
	
	
	CheckingAccount(int AccountNumber,int TotalBalance,int fee){
	
		super(AccountNumber,TotalBalance);
		this.fee = fee;
		
	}
	
	void feededuct(int totalbal,int fee) {
		if(totalbal>1000) {
			System.out.println("your fees deducted" + fee);
		}else {
			System.out.println("fee is less not deducted");
		}
		
		
	}
}


class SavingAccount extends Banking{
	int interestRate ;
	
	SavingAccount(int AccountNumber,int TotalBalance,int interestRate){
		super(AccountNumber,TotalBalance);
		this.interestRate = interestRate ;
	}
	
	void addInterest(int rate) {
	
		System.out.println("interest rate" + rate);
	}
}

class Inhertiestancecheck{
	
	public static void main(String[] args) {
		
		CheckingAccount c1 = new CheckingAccount(9485576,45000,250);
		c1.deposit(500);
		c1.getBalance(c1.AccountNumber, c1.TotalBalance);
		
		SavingAccount s1 = new SavingAccount(77532455,95000,4);
		s1.getBalance(s1.AccountNumber, s1.TotalBalance);
		
		
	}
	
}
















