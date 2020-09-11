import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileExampleString {

	public static void main(String[] args) throws IOException {
		// create file and open for write mode
		
		FileWriter f1 = new FileWriter("/home/pooja/dac.txt",true);
		
		// read data from console and get your string 
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("enter the string u want to write in file from console");
	      String str = br.readLine();
		//String str = "welcome to file handling ;in java" ;
		
		// to print multiple line together 

		while(!(str = br.readLine()).equals("exit")) {
			f1.write(str);
			
		}
		
		f1.close();
		br.close();
		
		
		System.out.println("file writing is over ");
		
		
		System.out.println("read the file directly through buffered");
		
		FileReader f2 = new FileReader("/home/pooja/dac.txt");
		
		BufferedReader br1 = new BufferedReader(f2);
		
		String str1 = null;
		
		while((str1 = br1.readLine())!= null) {
			System.out.println(str1);
			
		}
		
		
		
		
		f2.close();
		br1.close();
		
		
	}

}
