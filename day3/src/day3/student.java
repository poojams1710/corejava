package day3;

import java.util.Scanner;

public class student {
 
	Scanner sc = new Scanner(System.in);
	
	
	int id ;
	String name ;
	int[] mark = new int[5];
	int result;
	
	
	
	
	void setvalue() {
		System.out.print("enter student id");
		id = sc.nextInt();
		System.out.print("enter the student name");
		name = sc.next();
		System.out.print("enter the marks in 5 subject");
		
		for(int i = 0 ;i<5 ;i++) {
			mark[i] = sc.nextInt();
		}
			sc.close();
	}
	
	void displayResult(int[] mark , int n) {
		int total = 0;
		int percent ;
		System.out.print("student result ");
		for(int i =0 ;i< n ;i++) {
			 total = total + mark[i];
		}
		percent = (total/500)*100;
		
		if(percent > 33)
		{
			System.out.println("student is pass");
		}else {
			System.out.print("student is fail");
		}
		
	}


	
	public static void main(String[] args) {

		
		student s1 = new student();
		student s2 = new student();
		s1.setvalue();
		s1.displayResult(s1.mark, 5);
		
		s2.setvalue();
		s2.displayResult(s2.mark, 5);
		
		
		
		
	}
	

}
