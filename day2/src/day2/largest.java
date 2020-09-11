package day2;

public class largest {
	
	public static void main (String[] args) {
		int[] n = {1,2,5,6,7,111};
		int sum = 0;
		
		for(int i = 0 ; i < n.length ; i++) {
			sum  += n[i];
		}
		System.out.print(sum);
	}

	
}
