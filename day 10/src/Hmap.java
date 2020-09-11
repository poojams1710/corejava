import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hmap {
	
	public static void main(String[] args) {
		HashMap <Integer , String>  m = new HashMap<>();
		
		m.put(1, "DAC BLR");
		m.put(2, "DAC ele");
		m.put(3, "DAC pune");
		m.put(4, "DAC noida");
		m.put(5, "DAC mohali");
		
		System.out.println(m);
		
		for(Map.Entry obj :m.entrySet())
		{
			System.out.println(obj);
		}
	
	
	System.out.println("enter the key");
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	
	
	String val = m.get(id);
	System.out.print(val);
	
	
	System.out.print("enter the id to delete");
	id = sc.nextInt();
	
	
	
}

}
