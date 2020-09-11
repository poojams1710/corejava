import java.util.HashMap;
import java.util.Map;

public class MapObject {
	
	public static void main(String[] args)
{
     HashMap<Integer, Person> m=new HashMap();
     
     Person p1 = new Person(45,"pooja");
		Person p2 = new Person (46,"shivam");
		Person p3 = new Person(57,"mummy");
		Person p4 = new Person(23,"papa");
		
		m.put(1,p1);
		m.put(2,p2);
		m.put(3,p3);
		m.put(4,p4);
		m.put(5,new Person(788,"bnu"));
		
		
		for(Map.Entry obj :m.entrySet())
		{
			System.out.println(obj);
		}
	
}
}