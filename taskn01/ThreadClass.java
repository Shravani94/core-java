package taskn01;

public class ThreadClass extends Thread{
	ThreadClass t1;
	ThreadClass t2;
	public void run() {
		try {
		System.out.println("thread is in runnable state");
		System.out.println("Java is hot,aromatic, and invigorating");
		t1.sleep(500);
	}catch(Exception e)
		{
		System.out.println("Thread is interrupted");
		}
		System.out.println("Thread run over" +this);

}
}
