package taskn01;

public class MainClass {
	public static void main(String[] args)
	{
		ThreadClass t1=new ThreadClass();
		ThreadClass t2=new ThreadClass();
		t1.start();
		t2.start();
	}

}
