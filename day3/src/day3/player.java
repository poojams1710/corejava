package day3;

import java.util.Scanner;

public class player {
	
	String name ;
	int age;
	String countryName ;
	int totalRun;
	
	Scanner sc = new Scanner(System.in);
	
	void setPlayerDetails() {
		System.out.println("enter details of player ");
		System.out.println("enter name of Player");
		name = sc.next();
		System.out.print("Enter age of player");
		age = sc.nextInt();
		System.out.print("Enter the country name");
		countryName = sc.next();
		System.out.print("Enter the run");
		totalRun = sc.nextInt();
		
	}
	
	 static void displaydetails(player p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.countryName);
		System.out.println(p.totalRun);
		
	}
	
	static void goodscorer(player p) {
		
		if(p.totalRun > 5000) {
			System.out.println("Players having score more then 5000");
			displaydetails(p);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
	
	
		player p1 =  new player();
		player p2 = new player();
		player p3 = new player();
		player p4 = new player();
		player p5 = new player();
		
		p1.setPlayerDetails();
		p2.setPlayerDetails();
		
		
		player.goodscorer(p1);
		player.goodscorer(p2);
		
		
		
	}
	
	
	

}
