import java.util.LinkedList;

public class linked {
	
	
   public static void main(String[] args) {
	
	LinkedList <Integer> l1 = new LinkedList<>();
	l1.add(1);
	l1.add(5);
	l1.add(6);
	
	System.out.println(l1);
	
	l1.addFirst(3);
	l1.addLast(6);
	
	System.out.println(l1);
	l1.add(3,100);
	System.out.println(l1);
	l1.set(2,90);
	
	System.out.println(l1);
	
   }

}
