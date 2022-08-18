package taskno3;

public class DaemonThread extends Thread{
	public void run() {
		System.out.println("thread started"+this);
		try {
			Thread.sleep(1500);
			System.out.println("Thread name: " + Thread.currentThread().getName());
	        System.out.println("Check if its DaemonThread: "
	                        + Thread.currentThread().isDaemon());
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args)
	{
		 DaemonThread t1=new  DaemonThread();
		 DaemonThread t2=new  DaemonThread();
		 DaemonThread t3=new  DaemonThread();
		 t1.setDaemon(true);
		 t1.setName("myThread");
		 System.out.println(t1.getName());
		 System.out.println(t1.getState());
		 t1.start();
		 System.out.println(t1.getPriority());
		 System.out.println(t1.getStackTrace());
		 try {
		 t2.join();
		 System.out.println(t2.getState());
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 System.out.println(t1.hashCode());
		 System.out.println(t2.getState());
		 try {
		 t1.wait(500);
		 System.out.println(t1.getState());
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 t2.start();
		 t3.start();
	}

}