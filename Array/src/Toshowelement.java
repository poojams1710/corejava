import java.util.Scanner;

public class Toshowelement {
	
	public static void  print(int a[] ,int len) {
		for(int i=0 ;i <len ;i++) {
		System.out.print(a[i] + " ");
		}
		
	}
	
	public static void search (int a[], int b) {
		
		for(int i =0 ;i<a.length ;i++) {
			if(i == b ) {
			 System.out.println(a[i]);
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
	  System.out.print("Enter the number of test case");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
	  System.out.print("Enter the number of elements ");
	  int len = sc.nextInt();
	  
	  System.out.print("Enter the element index u want to search");
	  int b = sc.nextInt();
	  
	  int a[] = new int[len];
	  
	  for(int i =0 ; i<len ;i++) {
		  a[i] = sc.nextInt();
	  }
	  
	  print(a,len);
	  
	  System.out.println("********************************************************");
	  search(a,b);
	  
	  
		
	}

}
