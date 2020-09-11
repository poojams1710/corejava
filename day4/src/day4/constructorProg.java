package day4;

public class constructorProg {

	
	
	int sid ;
	String name;
	float feesamount;
	static String cname ="CDAC";
	
	
	// default constructor
	constructorProg(){
		System.out.println("constructor get called");
		sid = 12;
		name = "Pooja ";
		feesamount =12445 ;
		
	}
	
	// parameterized constructor 
	constructorProg(int id, String me,float fees){
		System.out.println("parameterized get called");
		this.sid = id;
		this.name = me;
		this.feesamount = fees;
		this.displayStudent();
		this.eligibilty();
		
		
	}
	
	
	constructorProg(constructorProg obj){
		System.out.println("copy constructor get called");
		sid = obj.sid;
		name = obj.name;
		feesamount = obj.feesamount;
		
		
	}
	
	
	
	
	void displayStudent() {
		System.out.println("student deatils ");
		System.out.println(sid);
		System.out.println(name);
		System.out.println(feesamount);
		System.out.println(cname);
	}
	
	// use of this keyword for referencing the instance method for  current calling  object .
	void eligibilty() {
		if(feesamount == 200000) {
			System.out.println("eligible");
		}else {
			System.out.println("not eligible");
		}
	}
	
	public static void main(String[] args) {
		constructorProg c1 = new constructorProg(100,"mummy" ,45666);
		constructorProg c2 = new constructorProg(101,"shivam",34456);
		constructorProg c3 = new constructorProg();
		
		// copy constructor 
		
		constructorProg c4 = new constructorProg(c2);
		
		
		c3.displayStudent();
		c4.displayStudent();
		
		
	}
	
	
}
;
