import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//How to write string content to a file and how to read file content line by line

public class assign1 {
	
	public static void main(String[] args) throws IOException {
	
	//through filewriter 
	FileWriter f = new FileWriter("/home/pooja/file1.txt",true);
	
	// read from console
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader b1 = new BufferedReader(in);
	
	System.out.print("enter the string u want to enter ");
	
	String str = b1.readLine();
	
	while(!(str = b1.readLine()).equals("exit")) {
		f.write(str);
		
	}
	
	f.close();
	
	System.out.print("writing in file single string line is over");
	
	
	FileReader ff = new FileReader("/home/pooja/file1.txt");
	
	// read the file through buffer efficientl
	BufferedReader b2 = new BufferedReader(ff);
	
	String storestring = null;
	
	while((storestring =b2.readLine()) != null) {
		
		System.out.println(storestring);
	}
	
	
	File f0 = new File("/home/pooja/file1.txt");
	FileReader fss = new FileReader(f0);
	
	BufferedReader bs = new BufferedReader(fss);
	
	String[] words = null ;
	int wc = 0;
	
	
	while((storestring =bs.readLine()) != null) {
		
		  words = storestring.split(" ");
		  wc = wc + words.length;
		
	}
	
	System.out.print(wc);
	
//	f2.read();
	
//	ff.close();
	b2.close();
	// 
	}
	
}
