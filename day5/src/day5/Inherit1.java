package day5;

public class Inherit1{

	int i ;
	void showi() {
		System.out.println(i);
	}
	
	
	
	
}

class B extends Inherit1{
	int j = 2;
	void showj() {
		System.out.println(j);
	}
}

class C extends B {                   /// multi level inheritance 
	int n =8;
	void shown() {
		System.out.println(n);
	}
	
}

class D extends Inherit1{                  // hierarical inheritance
	int m =0;
	void shownm() {
		System.out.println(m);
	}
}



class Inheritance{
	public static void main (String[] args) {
		
		B b = new B();
		b.j = 50;
		b.showj();
		
		b.i = 30;
		b.showi();
		
		D d = new D();
		
		
		d.shownm();
		
		
	}
}