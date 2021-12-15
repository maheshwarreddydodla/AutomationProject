package JAVA8Aand9Features;

import java.util.Optional;

public class OptionalTest {
	
	public static void main(String[] args) {
		
		String s=null;
		//Optional<String> optional=Optional.ofNullable(s);
		Optional<String> optional=Optional.of(s);
		
		if(optional.isPresent())
		{
		System.out.println(optional.get());	
		}
		else
		{
			System.out.println("value is not availble");
		}
		//System.out.println(s.toUpperCase());
	}

}
