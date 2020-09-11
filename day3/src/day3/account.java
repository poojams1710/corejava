package day3;

import java.util.Scanner;

public class account {
	
	long accno ;
	String accname;
	int amount;
	
	void withdraw(int withdrwalvalue) {
		System.out.println("your withdrwal " +withdrwalvalue);
		amount = amount - withdrwalvalue ;
		System.out.println("your current balance" + amount);
		
	}
	
	void deposit(int depositvalue) {
		System.out.println("your deposited amount" +depositvalue);
		amount = amount + depositvalue;
		System.out.println("your current balance " + amount);
		
		
	}
	void interest(int r , int t) {
		int interest = (amount * r * t)/100 ;
		System.out.println("your interest value "+ interest);
		
	}
	
	public void setvalue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account details invidually");
		System.out.println("enter account num");
		accno = sc.nextInt();
		System.out.println("enter the account name");
		accname = sc.next();
		System.out.print("enter the amount in detail");
		amount = sc.nextInt();
		
	}
	
	public static void main(String[] args) {
		account acc1 = new account();
		
		
		acc1.setvalue();
		
//		acc1.accno = 12234593;
//		acc1.accname = "pooja upadhyay";
//		acc1.amount = 234444;
//		
//		
		
		acc1.withdraw(33000);
		acc1.deposit(234);
		acc1.interest(12, 2);
	}
	

}
