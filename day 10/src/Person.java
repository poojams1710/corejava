
public class Person {
	
	int id ;
	String name;
	
	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	void disp() {
		System.out.print(id);
		System.out.println(name);
	}
	
	
	public String toString() {
		return "Person [id =" + id + " ,name = " +name +"]" ;
	}

}
