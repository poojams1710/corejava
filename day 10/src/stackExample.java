import java.util.Stack;

public class stackExample {
	
	public static void main(String[] args) {
		
		Stack<Integer> s= new Stack<>();
		s.push(20);
		s.push(45);
		s.push(2);
		s.push(204);
		s.push(205);
		s.push(208);
		
		System.out.println(s);
		
		System.out.println(s.pop());
		
		System.out.println(s);
		
		System.out.print(s.peek());
		
		System.out.println(s);
		
		
		
		
		
		
	}

}
