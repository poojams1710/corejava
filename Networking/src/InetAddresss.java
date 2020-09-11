import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddresss {
	
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		
		System.out.println(address);
		
		System.out.println("localhost add" +address.getHostAddress());
		
		System.out.println("localhost name" + address.getHostName());
		
		// find ip address of website 
		
		address = InetAddress.getByName("google.com");
		
		System.out.println("Google address   " + address);
	}

}
