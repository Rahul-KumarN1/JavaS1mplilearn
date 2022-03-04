package sljava;

public class YieldDemo extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
			//this is thread-0
		}
	}
	public static void main(String[] args) {
		YieldDemo yd=new YieldDemo();
		yd.start();
		Thread.yield();
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i);
			// here, main method yields.
			// thread executes first.
		}
	}

}
