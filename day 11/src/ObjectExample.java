import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class ObjectExample {
	
	public static void main(String[] args) throws IOException, NotSerializableException {
		
		Person p1 = new Person(1,"pooja");
		Person p2= new Person (2,"shivam");
		Person p3 = new Person(3,"poojams");
		
		// writing object in file 
		
		FileOutputStream fos = new FileOutputStream("/home/pooja/dac2");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		
		fos.close();
		oos.close();
		
		System.out.println("writing object is over");
		
		
	}

}
