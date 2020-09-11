package day6;

public class Employee {
	int id;
	String name;
	int salary ;
	Address add;
	
	public Employee(int id, String name, int salary, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.add = add;
	}

	void display() {
		System.out.println(id + " " + name +"" + salary + " has a relation and entity refrences    "+add.city +  "          "  + add.nation +add.flatNumber);
		
	}
	
	public static void main(String[] args) {
		Address a = new Address("delhi" , "India" ,23);
		Employee e = new Employee(21,"pooja",45000,a);
		
		e.display();
		
	}

}
