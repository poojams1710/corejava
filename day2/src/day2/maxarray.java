package day2;

import java.util.Scanner;

public class maxarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the elements in the array");
		int n = sc.nextInt();
		int[] a = new int[n];		
		System.out.print("start entering ");
		for(int i =0 ;i< n;i++) {
			a[i] = sc.nextInt();
		}
		int max = a[0];
		int min = a[0];

		
		for(int i= 0;i <a.length ;i++) {
			if(max <= a[i]) {
				max = a[i];
			}
			
		if(min >= a[i]) {
				min = a[i];
		}
			
		}
		
	
	System.out.println(max);
	System.out.println(min);
	}
	

}
