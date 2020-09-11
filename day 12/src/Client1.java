import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;
import java.net.*;

public class Client1 {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		
		Socket s = new Socket("127.0.1.1" ,1300);
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("enter the  string in console to wrie on socket");
		
		
		String str ;
		
		str = br.readLine();
		
		
		OutputStream os = s.getOutputStream();
		PrintStream ps = new PrintStream(os);
				
			
		
		System.out.println(str);
				os.close();
		        ps.close();
		        
		  
		 s.close();       
		
	}
	
	

}

