package day2;
import java.util.Scanner;

public class LargestNum {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the num u wants to check highest among three");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print("highest is ");
		
		if(a > b) {
			if( a > c) {
				System.out.print("a is greatest =" +a);
			}else {
				System.out.print("b is greatest = " +c);
			}
		}else {
			if(b > c) {
				System.out.print(b);
			}else {
				System.out.print(c);
			}
		}
		
	}

}
