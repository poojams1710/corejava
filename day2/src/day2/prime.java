package day2;

import java.util.Scanner;

public class prime {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the range upto ");
		
		int range = sc.nextInt();
		
		System.out.println("Prime number in this range");
		
		// prime num 1 2 3 5 7 11 
		// make a loop 
		
		
		for(int n =1 ; n<= range ;n++) {
			int c = 0 ;
			
			for(int i = 1; i <= n; i++) {
				if(n % i == 0) {
					c = c+1;
					
				}
				
			}
			if(c == 2 || c == 1) {
				System.out.print(n + " ");
			}
			
			
		}
		
		
		
	}

}
