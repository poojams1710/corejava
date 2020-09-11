package day6;

public class InhCons {
	int i;
	InhCons(){
		System.out.println("no arg constructor");
	}
	
	InhCons(int i){
		System.out.println("parametrized constructor" + i);
	}
	

}

class child  extends InhCons{
	
	int j;
	child(){
		System.out.print("no arguement child constructor");
	}
	
	child(int j,int i){
		super(i);
		System.out.print("parametrize in child" + j);
	}
}


class testinherit{
	
	public static void main(String[] args) {
	
	child c1 = new child(2,7);
	}
	
	
}
