import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	
	
	public static void main(String[] args) throws IOException {
	//create the server socket 
	ServerSocket ss = new ServerSocket(1300);
	ss.setReuseAddress(true);
	ss.bind(new InetSocketAddress(1234));
	Socket s = ss.accept();
	System.out.print("socket created");
	
	
//	InputStream is = s.getInputStream();
	// read form socket
	
//	InputStreamReader ir = new InputStreamReader(System.in);
//	BufferedReader br = new BufferedReader(ir);
//	System.out.print("enter the string from server ");
	
	InputStream os = s.getInputStream();
	InputStreamReader ir = new InputStreamReader(os);
	BufferedReader br = new BufferedReader(ir);
	
	
	String str;
	str= br.readLine();
	
	// write on console 
	
	System.out.print("data send from clinet is " +str);
	
	ss.close();
	s.close();
	
	
	}

}
