import java.util.Scanner;

public class BankAccount {
	
	
	public  static credit choose(String ChooseWay) {
		
		if(ChooseWay.equals("Rupee")) {
			return new Rupee();
			
		}else {
			return new doller();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the payment mode ");
		
		String ChooseWay ;
		
		ChooseWay = sc.next();
		
		credit cc ;
		 cc  = choose(ChooseWay);
		 cc.pay();
	   
		
	}

}
