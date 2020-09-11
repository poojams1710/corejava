import java.util.Scanner;

public class upcastingRunTPoly {
	
	int cid ;
	String cname ;
	int balance;
	float loanamount ;
	
	public upcastingRunTPoly(int cid, String cname, int balance, float loanamount) {
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
	  
	  void getInterest() {
		 float interest = 0;
		 interest= loanamount*2;
		 
		 System.out.println(interest);
	  }
	  
	  void displayCus() {
		  System.out.println(cid + "" + cname +" "+ balance +""+ loanamount);
	  }

}


class sbi extends upcastingRunTPoly {
	
	int NumTrans;

	public sbi(int numTrans ,int cid, String cname, int balance, float loanamount) {
		super(cid, cname, balance, loanamount);
		this.NumTrans =numTrans ;
	
	}

	/// method overriding for sbi one method 
	
	 void getInterest() {
		 float interest = 0;
		 interest= loanamount*4;
		 
		 System.out.println(interest);
	  }
	  
	
}

class icici extends upcastingRunTPoly {
	
	int NumT;

	public icici(int NumT,int cid, String cname, int balance, float loanamount) {
		super(cid, cname, balance, loanamount);
		this.NumT =NumT;
		
	}
	
	// method overriding again the method getInterest its override and subclass give priority to its own class method 
	 void getInterest() {
		 float interest = 0;
		 interest= loanamount*3;
		 
		 System.out.println(interest);
	  }
	  
	

}




class TestBank{
	
	public static upcastingRunTPoly  creatObj(String Bankname) {
	if(Bankname == "sbi")
	{
	 return new sbi(3,67,"pooja",4500,450);
	}else {
		return new icici(6,78,"shivam",7600,760);
	}
	
}
	
	public static void main(String[] args) {
		
		// up casting 
		upcastingRunTPoly b;
		Scanner sc = new Scanner(System.in);
		System.out.print("To show the run time polymorphism in real. enter name of bank");
		String cname = sc.nextLine();
		
		b = creatObj(cname);
				
		
//	    b= new sbi(5,67,"pooja",6500,340);
//	    b.displayCus();
//	    b.getbalance();
//		b.getInterest();
//		
//		b= new icici(3,68,"shivam",6500,340);
		
		b.getInterest();
		
	}

	
}

//over riding can be only possible with instance method //
//n// ot with static
// static somewhere related to 
//class 

// while we can over load main metho





