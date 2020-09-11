import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Alist {
	
	public static void addPersonObject(ArrayList<Person> a1) {
		Person p1 = new Person(45,"pooja");
		Person p2 = new Person (46,"shivam");
		Person p3 = new Person(57,"mummy");
		Person p4 = new Person(23,"papa");
		
		a1.add(p1);
		a1.add(p2);
		a1.add(p3);
		a1.add(p4);
		
	}
	
	public static void disPersonObject(ArrayList<Person> a1) {
		
		for(Person obj:a1) {
			
			
			System.out.println(obj.toString());
		}
		
	}
	
	public static void removePersonObject(ArrayList<Person> a1) {
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.print("enter id to be deleted");
		id = sc.nextInt();
		
		int pos=0;
		for(Person obj :a1) {
			if(obj.id == id ) {
				 pos= a1.indexOf(obj);
				
			}
		}
		a1.remove(pos);
		
	}
	
	public static void updatePersonObject(ArrayList<Person> a1) {
		Scanner sc = new Scanner(System.in);
		int id;
		System.out.print("enter pid");
		
		id = sc.nextInt();
		String cname = sc.next()
;
		
		
		int pos = 0;
		for(Person obj : a1) {
			if(obj.id == id) {
				obj.name = cname ;
			}
		}
		
		
		
	}
	
	
	private static void sortingPersonObject(ArrayList<Person> a1) {
		sortby s = new sortby();
		Collections.sort(a1,s);
		
		System.out.print(" Object after sorting");
		
	}
	
	
	
	private static void sortingByName(ArrayList<Person> a1) {
		
		System.out.println("alpha sorting");
		sortname n =new  sortname();
		Collections.sort(a1,n);
		
	}

	
	public static void main(String[] args) {
		
		ArrayList<Person> a1 = new ArrayList<>();
		addPersonObject(a1);
		disPersonObject(a1);
		removePersonObject(a1);
		disPersonObject(a1);
		updatePersonObject(a1);
		disPersonObject(a1);
		sortingPersonObject(a1);
		disPersonObject(a1);
		sortingByName(a1);
		
		
		
	}

	
	
	
	
	

}


class sortby implements Comparator<Person>{
	
	public int  compare(Person p1 ,Person p2)
	{
		if(p1.id > p2.id)
	{
		return 1;
	}
		return -1;
}
 }


 class sortname implements Comparator<Person> {

	public int compare(Person p1 ,Person p2) {
		
		return p1.name .compareTo(p2.name);
		

	}

}
