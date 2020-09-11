package day6;

public class one {
	
	void One() {
		System.out.println("One arguemnt");
	}

}

class Two extends one{
	
	void two() {
	System.out.println("Two arguemnt");
	}
	
	
}
class Three extends Two {
	
	void three() {
	System.out.println("THree class ;");
	}
}


class test {
	public static void main(String [] args) {
	Two t = new Two(); 
	t.One();
	t.two();
	}
}