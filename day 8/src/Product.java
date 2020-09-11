import java.util.Scanner;
// interface can not create object its have only refrence and can take object as refence of 
public class Product {
	
	public static MyInterface createObject(String cname) {
		
		if(cname.equals("oracle")) {
			return new oracle();
		}else {
			return new MongoDb();
		}
		
	}

	public static void main(String[] args) {
		
		System.out.print("enter the db connection from what server");
		Scanner sc = new Scanner(System.in);
		String cname = sc.next();
		
		MyInterface p;
		
		p = createObject(cname);
		p.connect();
		
		
//		oracle o = new oracle();
//		o.connect();
//		MongoDb m = new MongoDb();
//		m.connect();

	}

}
