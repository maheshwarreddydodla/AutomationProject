package JavaPrograms;

public class PrintThousandTimes {
	
	public static void main(String[] args) {
		
		String name="mahesh";
		String s="i";
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiii");
		
		s=s.replaceAll("i",name+"\n");
		System.out.println(s);
		
		
	}

}
