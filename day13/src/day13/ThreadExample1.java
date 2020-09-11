package day13;

public class ThreadExample1 extends Thread{
	public void run () {
		System.out.println("thread is rrunning" + Thread.currentThread().getName());
		
		for(int i =0 ;i< 100 ;i++) {
			System.out.println(i);
		}
		
	System.out.println("thread is ended");
	}
	public static void main(String[] args) {
		ThreadExample1 t = new ThreadExample1();
		ThreadExample1 t2 = new ThreadExample1();
		t.start();
		t2.start();
		
		System.out.println("main ended");
	}

}
