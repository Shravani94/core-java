package taskno4;

public class ThreadLifeCycle extends Thread{
	public void run()
	{
		System.out.println("Thread stated");
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(1000);
			System.out.println(Thread.activeCount());
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String []args)
	{
		ThreadLifeCycle tlc1=new ThreadLifeCycle();
		ThreadLifeCycle tlc2=new ThreadLifeCycle();
		tlc1.start();
		System.out.println(tlc1.getState());
		
		try {
			tlc1.join();
			tlc2.start();
			System.out.println(tlc1.getState());
			System.out.println(tlc2.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			tlc1.wait();
			System.out.println(tlc2.getState());
			tlc2.notify();
			System.out.println(tlc2.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tlc1.interrupt();
		System.out.println(tlc1.getState());
	//	tlc2.suspend();
		System.out.println(tlc2.getState());
		tlc2.resume();
		System.out.println(tlc2.getState());
		
	

		
		
		
	}

}
