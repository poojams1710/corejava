package day6;

public class polymorphism {
	
	
	void fun1(){
		System.out.println("function 1 from super class");
	}

	
	void fun2(){
		System.out.println("function 2 from super class");
	}
}


class childclass extends polymorphism{
	 
	
	void fun1() {
		System.out.println("function 1 from child class");
	}
}


class testcheck
{
	public static void main(String[]  args) {
		
		childclass c = new childclass();
		
		System.out.println("method overridding in this case two class having same"
				+ " name function one inherit the super but child class functon "
				+ "ill get exe cute at end get priority to execute thats what overriding is ");
		c.fun2();
		c.fun1();
		
	}
}