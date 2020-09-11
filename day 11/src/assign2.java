import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class assign2 {
	
	public static void main(String[] args) throws IOException {
		


	FileOutputStream f2 = new FileOutputStream("/home/pooja/file1.txt");
	
	DataOutputStream di1 = new DataOutputStream(f2);
	
	
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(ir);
	System.out.println("enter the person details u want to send to file1");
	
	int num = Integer.parseInt(br.readLine());
	
	
	System.out.println("enter the name of person");
	
	String name = br.readLine();
	
	System.out.println("enter person salary");
	
	float salary = Float.parseFloat((br.readLine()) );
	
	di1.write(num);
	di1.writeUTF(name);
	di1.writeFloat(salary);
	
	
	
	f2.close();
	di1.close();
	br.close();
	
//	FileReader fr = new FileReader("/home/pooja/file1.txt");
//	
//	BufferedReader b3 = new BufferedReader(fr);
//	String stored = null;
//	
//	while((stored = b3.readLine()) != null) {
//		System.out.println(stored);
//		
//	}
//	
//	fr.close();
//	b3.close();
	
	try {
	FileInputStream fr = new FileInputStream("/home/pooja/file1.txt");
	DataInputStream dis = new DataInputStream(fr);
	
	
	 num = dis.readInt();
	 name = dis.readUTF();
	 salary = dis.readFloat();
	 
	 
	 System.out.println(name +"  " + num +"  "+ " " + salary );
		
		}catch(EOFException e) {
			System.out.println("end");
		}
	
}	

}
