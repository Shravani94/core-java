package taskno2;

public class MianClass {
public static void main(String[]args)
{
	ThreadClasses t1=new ThreadClasses();
	avg t2=new avg();
	show t3=new show();
	t1.setPriority(8);
	t1.setPriority(4);
	t1.setPriority(10);
	System.out.println(t1.getName());
	System.out.println(t1.getState());
	t3.start();
	t1.start();
	t2.start();
	
	
}
}
