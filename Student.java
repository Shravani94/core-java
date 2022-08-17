package aggegation;

public class Student {
	public String name;
	public String deptName;
	public Student(String name,String deptName)
	{
		this.name=name;
		this.deptName=deptName;
		
		
	}
	public String toString()
	{
		return "Name :"+name+"\n deptName: "+deptName;
	}

}
