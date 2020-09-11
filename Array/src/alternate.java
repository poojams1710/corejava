import java.util.Scanner;

public class alternate {
	 Scanner sc = new Scanner(System.in);
	
	
	   void print(int[] a) {
		   for(int i =0 ;i<a.length ;i++) {
			   System.out.print(a[i]);
		   }
		   
	   }
	   
	   void arrayElement(int[] a) {
    	   for(int i =0 ;i<a.length ;i++) {
    		   a[i] =  sc.nextInt();
    	   }
		   
	   }
	   
	   void alterElement(int[] a) {
		   System.out.println("alternate elements ");
		   for(int i =0 ;i<a.length ;i=i+2) {
			   System.out.println(a[i] + " ");
		   }
	   }
	
           public static void main(String[] args) {
        	  
        	   
        	   
        	   System.out.print("enter the size of array");
        	   Scanner sc = new Scanner(System.in);
        		
        	  int  size = sc.nextInt();
        	  int[] a= new int[size];
        	   alternate b = new alternate();
        	   b.arrayElement(a);
        	   b.print(a);
        	   b.alterElement(a);
        	   b.print(a);
        	   
           }

}
