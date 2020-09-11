package day6;

public class Address {
	
	// has  a relation kind of polymorphism in Employee
	
	String city ;
	String nation ;
    int flatNumber ;

	public Address(String city, String nation, int faltNumber) {
		super();
		this.city = city;
		this.nation = nation;
		this.flatNumber = faltNumber;
	}
	
	 void display() {
		 System.out.print(city + "" +nation  +" " +flatNumber);
	 }
	
}
