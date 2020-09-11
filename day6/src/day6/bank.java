package day6;

 abstract public class bank {
	// method overriding is runtime polymorphism like at run time its come in existance while method overloading is like
	// having same name function name inside same class only parameter and type of parameter get diff 
	//  with diff functionality;
	int cid ;
	String cname ;
	int balance;
	float loanamount ;
	
	public bank(int cid, String cname, int balance, float loanamount) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.balance = balance;
		this.loanamount = loanamount;
	}

	
	  void withdrawal() {
		  System.out.println("withrawal done");
	  }
	  
	  void deposit() {
		  System.out.println("deposit done");
	  }
	  
	  void getbalance() {
		  System.out.println("balance ");
	  }
	  
	  abstract public  void getInterest();
		
	  
	  void displayCus() {
		  System.out.println(cid + "" + cname +" "+ balance +""+ loanamount);
	  }

}


class sbi extends bank {
	
	int NumTrans;

	public sbi(int numTrans ,int cid, String cname, int balance, float loanamount) {
		super(cid, cname, balance, loanamount);
		this.NumTrans =numTrans ;
	
	}

	/// method overriding for sbi one method 
	
	public void getInterest() {
		 float interest = 0;
		 interest= loanamount*4;
		 
		 System.out.println(interest);
	  }
	  
	
}

class icici extends bank {
	
	int NumT;

	public icici(int NumT,int cid, String cname, int balance, float loanamount) {
		super(cid, cname, balance, loanamount);
		this.NumT =NumT;
		
	}
	
	// method overriding again the method getInterest its override and subclass give priority to its own class method 
	public void getInterest() {
		 float interest = 0;
		 interest= loanamount*3;
		 
		 System.out.println(interest);
	  }
	  
	
}

class TestBank{
	
	public static void main(String[] args) {
	    sbi s1 = new sbi(5,67,"pooja",6500,340);
	    s1.displayCus();
	    s1.getbalance();
		s1.getInterest();
		
		icici c1 = new icici(3,68,"shivam",6500,340);
		c1.displayCus();
		c1.getInterest();
		
	}
}












