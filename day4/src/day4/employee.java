package day4;

import java.util.Scanner;

/// array of object 

public class employee {
	int eid;
	String ename;
	int salary;
	
	employee(int sid, String ename, int salary){
		this.eid = sid;
		this.ename = ename ;
		this.salary = salary ;
		
	}
	
	void display() {
		System.out.println("deatils ill show from here");
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(salary);
	}
	
	
	public static void main(String[] args) {
		
		employee[] e = new employee[3];
		
		for(int i =0 ;i< 3 ; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter employee detail eid");
			int eid = sc.nextInt();
			System.out.println("enter employee detail ename");
			String ename = sc.next();
			System.out.println("enter employee detail salary");
			int salary = sc.nextInt();
			e[i] = new employee( eid, ename,salary);
		}
		
		for(int i =0 ;i<e.length ;i++) {
			e[i].display();
		}
		
		
	}

}
