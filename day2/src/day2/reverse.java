package day2;
import java.util.*;

public class reverse {
	
	public static void main(String[] args) {
		int r;
		int reverse = 0;	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number to be reversed");
	
	int num = sc.nextInt();
	while(num != 0) {
		r = num % 10;
		reverse = reverse*10 + r;
		num = num /10;
		
		
	}
	System.out.print(reverse);
	
	}
	
	

}
