package day2;

import java.util.Scanner;

public class reversearray {
	
	public static void arrayprint(int[] a,int n) {
		for(int i =0 ;i <n ;i++)
		System.out.println(a[i]);
		
	}
	
	public static void arrayreverse(int[] a, int n) {
		for(int i =n-1 ;i>=0 ;i--) {
			System.out.println(a[i]);
			
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the array size u want to reverse");
		int n = sc.nextInt();
		int[] a =  new int[n];
		System.out.println("start entering the elements");
		for(int i =0 ; i<n ;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("your entered array");
		
		arrayprint(a,n);
		
		System.out.println("reverse the array elements ");
		
		arrayreverse(a,n);
		
	}

}
