package JAVA8Aand9Features;

import java.util.Optional;

public class OptionalTest2 {
	public static void main(String[] args) {
		
		
		String[] strArr= {"Mahesh","Ramesh","null"};
		
		for(int i=0;i<strArr.length;i++)
		{
			Optional<String> optional=Optional.ofNullable(strArr[i]);
			if(optional.isPresent())
			{
				System.out.println(optional.get().toUpperCase());
			}
			else
			{
				System.out.println("Value is not avialble at: "+i);
			}
		}

	}

}
