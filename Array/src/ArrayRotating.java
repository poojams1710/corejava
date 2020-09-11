import java.util.Scanner;

public class ArrayRotating {
	
	
	
	       void rotate(int[] a ,int d,int n) {
	    	   for(int i=0 ;i< d;i++) {
	    		   Onerotating( a,n);
	    	   }
	       }
	    
	       int Onerotating(int[] a,int n){
	    	 int i, temp; 
	         temp = a[0]; 
	         a[0] = a[n-1];
	         a[n-1] = temp;
//	         for (i = 0; i < n - 1; i++) 
//	            a[i] = a[i + 1]; 
//	         a[i] = temp; 
	         return a[0];
//	             
	    } 
	     
	    
	    void Print(int[] a ) {
	    	 for(int i=0; i<a.length ;i++){
	 	        System.out.print(a[i] + " ");
	 	    }
	    	
	    }
	    
	    
		public static void main (String[] args) {
		    ArrayRotating a1 = new ArrayRotating();
		   
		    int[] a = {5,3,2,7,9,1};
//		Scanner sc = new Scanner(System.in);
//	    System.out.println("Enter the size");
//	    int n = sc.nextInt();
//	    int[] a =  new int[n] ;
	    
//	    System.out.println("Enter rotating");
//	    int D = sc.nextInt();
	    
//	    System.out.println("start entering your array elements");
//	    for(int i =0;i<a.length ;i++){
//	        a[i] = sc.nextInt();
//	    }
	    
	    
	       a1.rotate(a,2,6);
		    a1.Print(a);
		    
		    
		    
	}
}


