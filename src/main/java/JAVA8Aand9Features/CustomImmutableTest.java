package JAVA8Aand9Features;

public class CustomImmutableTest {
	
	private int practice;
	private String instname;
	
	public CustomImmutableTest(int practice,String instname)
	{
		this.practice=practice;
		this.instname=instname;
		
	}
	
	public int getPractice()
	{
		return practice;
		
	}
	
	public String getInstName()
	{
		return instname;
	}
	
	public static void main(String[] args) {
		CustomImmutableTest test=new CustomImmutableTest(1,"mahesh");
		System.out.println(test.getInstName());
		System.out.println(test.getPractice() );
		
	}

}
