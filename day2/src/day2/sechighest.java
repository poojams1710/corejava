package day2;

import java.util.Scanner;

public class sechighest {
	
	public static int sechighestelement(int[] a, int n) {
		int first ;
		int second ;
		first = second =Integer.MIN_VALUE;
		
		for(int i =0;i<n ;i++) {
			if(a[i]> first) {
				second = first ;
				first = a[i];
			}
			
			if(a[i]> second  && a[i]!= first) {
				second = a[i];
			}
		}
			
		
		return second;
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("size of array entered at executaion time");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.println("enter the elements of array");
		
		for(int i =0; i<n ;i++) {
			a[i] = sc.nextInt();
		}
		
	
		
		//print your entered array
		
		for(int i=0 ; i<n ;i++) {
			System.out.print(a[i] + "  ");
		}
		
		int secondhighest = sechighestelement(a,n);
		System.out.println("your highest element " +secondhighest);
		
		
	
	}
}
