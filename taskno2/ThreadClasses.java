package taskno2;

public class ThreadClasses extends Thread {
	ThreadClasses t1;
	public static synchronized  void add()
	{
		int a=20;
		int b=30;
		int value=a+b;
		System.out.println("Addition of two numbers is"+value);
	}
	public void run()
	{
		System.out.println("runnable is started");
		try {
			t1.sleep(1500);
			
			add();
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		System.out.println(this+"run method overheaded");
		
	}

}
class avg extends Thread{
	avg t2;
	public static synchronized void avg()
	{
		int a=40;
		int b=20;
		int avg=(a+b)/2;
		System.out.println("avg is "+avg);
	}
	public void run()
	{
		avg();
		System.out.println(this+" run method overheaded");
	}
}
class show extends Thread{
	show t3;
	public static synchronized void display()
	{
		ThreadClasses.add();
		avg.avg();
		
		
	}
	public void run()
	{
		System.out.println("runnable is started");
		try {
			t3.sleep(1500);
			
			display();
			
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		System.out.println(this+"run method overheaded");
		
	}

}
