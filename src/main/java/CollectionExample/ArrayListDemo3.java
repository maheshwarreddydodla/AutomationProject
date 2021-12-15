package CollectionExample;

import java.util.ArrayList;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("JAVA");
		ar1.add("Selenium");
		ar1.add("Spring");
		ar1.add("Javascript");
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Python");
		ar2.add("Ruby");
		
//		System.out.println(ar1);
//		System.out.println(ar2);
//		
//		System.out.println("----------------------");
//		
//		ar1.addAll(ar2);
//		
//		System.out.println(ar1);
//		System.out.println(ar2);
//		
//		System.out.println("----------------------");
//		
//		ar1.addAll(2,ar1);
//		System.out.println(ar1);
//		System.out.println(ar2);
		
//		ar1.clear();
//		System.out.println(ar1);
//		System.out.println(ar2);
		
		ArrayList<String> clonedList=(ArrayList<String>)ar1.clone();
		System.out.println(clonedList);
	
		
		
		
	}

}
