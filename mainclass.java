package aggegation;

public class mainclass {
	public static void main(String[] args)
	{
		Student std=new Student("shravani","cse");
		Depatment d=new Depatment(std,"scit");
		String details=d.toString();
		System.out.println(details);
		
		
		
	}

}
