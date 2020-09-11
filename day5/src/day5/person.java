package day5;

public class person {
	
	int id; 
	String name;
	public person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
	

}


class student extends person{
	int mark ;
	
	student(int id, String name ,int mark){
		super(id,name);
		this.mark = mark;
	}
	
	void findresult() {
		String  result;
		if(mark >33) {
			result ="pass";
		}else {
			result = "fail";
		}
		System.out.println(result);
	}
	
	
}

class testinheritance{
	public static void main(String[] args) {
		student s1 = new student(1,"pooja",40);
		s1.findresult();
		s1.display();
	}
}



