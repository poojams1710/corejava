import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Objectread {
	
public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		// read object from file 
		
		FileInputStream fis = new FileInputStream("dac2");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// read from file 
		
		Person obj = (Person) ois.readObject();
		try {
		
		while((obj= (Person)ois.readObject())!= null)
		{
			obj.disp();
		}
		// write on console
        //		obj.disp();
		
	}catch(EOFException e) {
		System.out.print("END");
	}
}

}
