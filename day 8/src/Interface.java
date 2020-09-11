import java.util.Scanner;

public interface Interface {
           void print();
	

}

class sec implements Interface{
	
	static String  id ;

	
	public String toString () {
		return id ;
	}
	
	public  void print() {
		System.out.print("its a interface things 100 perc abstraction all methods must be abstract inside interface class ");
	}
	
	public static void main(String[] args) {
		
		System.out.print("this is example of object as class ");
		Scanner sc = new Scanner(System.in);
		 id = sc.next();
		
		
		sec s = new sec();
		System.out.print(s);
		
		
	}
}