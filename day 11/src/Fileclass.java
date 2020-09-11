import java.io.File;
import java.io.IOException;

public class Fileclass {

	public static void main(String[] args) throws IOException ,NullPointerException{
		File f = new File("dac4.txt");
		f.createNewFile();
		System.out.println(f);
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.isFile());
		System.out.println(f.isAbsolute());
		System.out.println(File.listRoots());
		System.out.println(f.exists());
		
		System.out.println("file only get created when u ll use createnew file() method");
		
		
//		File dir = new File("");
//		File files[] = dir.listFiles();
//		for(File file:files) {
//			System.out.print(file.getName() +" Can Write " +file.canWrite() +"ids Hidden " +file.isHidden() +" length " + file.length()) ;
//		}
//		
		
	}

}
