package day5;

public class Electricity {
	
	
	void calculateAmount(int unit) {
		if(unit>4000) {
			
			int b = unit * 5;
			System.out.println(b);
		}else {
			System.out.println(unit);
		}
		
	}

}
