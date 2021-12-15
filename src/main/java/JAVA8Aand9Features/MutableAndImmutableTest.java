package JAVA8Aand9Features;

public class MutableAndImmutableTest {
	
	public static void main(String[] args) {
		
		String s1=new String("Selneium");
		String s2=s1.concat("Java");
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuffer sb1=new StringBuffer("Selneium");
		sb1.append("Java");
		

		System.out.println(sb1);
	}

}
