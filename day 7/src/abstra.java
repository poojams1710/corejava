
public  abstract class abstra {
	
	
	/// if a class having abstarct keyword class become absract class not only abstract class but called as abstract method 
	
	// what is abstarct method if any method not having implementation only declartion such kind of method is called abstract mehtod
	
	// we can not create object of abstract method 
	
	//it can not be instanciated 
	
	// its ment for inheritance 
	// abstract class can become a parent and class which inheriting the class the classs whcich is inheritaing this class 
	// must implemnt 
	
	// the inherited class must implement / override the abstarct method
	
	
	// ******************* abstract is just to avoid the overirden method 
	// like if u sure that this method is going to implement in inherited class then just make 
   // in very starting that method class at abstract that all this method u have to use again and define again
	
	// but follow my standard 
	// can we make metjod as anstract only 
	
	
	abstract public void m2();
	
	void print() {
		
		System.out.println("non abstract method");
	}
	
	

}


class child extends abstra {
	public void m2() {
		System.out.println("child implemented abstarct method");
	}
	
	public static void main(String[] args) {
		child c = new child();
		c.m2();
		c.print();
	}
}
