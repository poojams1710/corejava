package day5;

public class customer extends Electricity{
	
	int bill;
	String holdername;
	
	
	public customer(int bill, String holdername) {
	
		this.bill = bill;
		this.holdername = holdername;
	}
	
	
	void display() {
		System.out.println(bill);
		System.out.println(holdername);
	}
	

	
	
	public static void main(String[] args) {
		customer c = new customer(77888,"pooja");
		
		
//		Electricity e =new Electricity();
//		e.calculateAmount(c.bill);
		
		
		c.calculateAmount(c.bill);
		c.display();
		
		
		
	}
}
