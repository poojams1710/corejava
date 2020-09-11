import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileExamplePrimitive {
	
	public static void main(String[] args) throws IOException{
		
		// open file to write
		FileOutputStream f1 = new FileOutputStream("dac.txt");
		
		// write primitives 
		
		DataOutputStream dis = new DataOutputStream(f1);
		
		// read from console
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("enter the id");
		
		int id = Integer.parseInt(br.readLine());
		
		System.out.println("enter cname");
		
		String cname = br.readLine();
		
		System.out.println("enter price");
		
		float price = Float.parseFloat(br.readLine());
		System.out.println("enter the code ");
		
		int code = br.read();
		
		
		dis.writeInt(id);
		dis.writeUTF(cname);
		dis.writeFloat(price);
		dis.writeChar(code);
		
		ir.close();
		br.close();
		dis.close();
		
		
		System.out.print("primitive write in file from console is over input type");
		
		FileInputStream fis = new FileInputStream("dac.txt");
		DataInputStream dos = new DataInputStream(fis);
		
		 id = dos.readInt();
		 cname = dos.readUTF();
		price = dos.readFloat();
		code = dos.readChar();
		
		
		
		System.out.println(id + " "  + cname +"/n" + price +"/n " + code +"/n ");
		
		
		
		
		
		
		
	}

}
