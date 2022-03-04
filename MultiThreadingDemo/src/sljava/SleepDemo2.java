package sljava;


class Test extends Thread{
	public void run()
	{
		//start of thread 1
		for(int i=1;i<=5;i++) {
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception e) {
				System.out.print(e);
				//end of Thread 1
			}
		}
	}
}

public class SleepDemo2 {

	public static void main(String[] args) {
		
		Test te=new Test();
		te.start();
         // In this program, thread 1 goes into sleep mode
		// Each output is generated after 1 second.
	}

}
