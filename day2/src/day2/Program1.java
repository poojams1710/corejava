package day2;
import java.util.*;


public class Program1 {
 
	public static void main(String[] args) {
		int sum = 0;
		int r = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the digits for sum");
	     int n = sc.nextInt();
	     
	     while(n>10) {
	    	  r = n %10;
	    	 n =n/10;
	    	 sum = sum + r;
	     }
	       sum = sum + n;
	     
		System.out.println(sum);
		
		
	}

}
