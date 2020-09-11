package day2;
import java.util.Scanner;



public class variable {
	
	// user defined methods
	// make it static to access without obj 
	
	
	public static double discount(double price) {
		double dis = price * 0.1;
		return dis;
	}
	
	public static void displayProduct(int pid, float price, String name) {
		
		System.out.println("the price ill come from this user defined methods");
		
		System.out.println("product id = " +pid);
		System.out.println("product price = " +price);
		System.out.println("product name =" +name);
		
	}
	
	
	
	// read the data from user through scanner class
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("start entering the details");
		int pid = sc.nextInt();
		float price = sc.nextFloat();

		String name = sc.next();
		
		
    displayProduct(pid,price,name);		
    
    System.out.println("after this its printed through arguements call");
   
		double dis = discount(price);
		System.out.print("discount =" +dis);
		
	}

}
