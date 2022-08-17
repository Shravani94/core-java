package aggegation;

public class Depatment {
	private Student std;
	private String instituteName;
	public Depatment(Student std,String instituteName)
	{
		this.std=std;
		this.instituteName=instituteName;
		
	}
	public String toString() {
		return "student details "+std+"\n instituteName "+instituteName;
	}
	

}
