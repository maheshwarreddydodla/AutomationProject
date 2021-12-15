package CollectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> students=new ArrayList<String>();
		students.add("Mahesh");
		students.add("Naresh");
		students.add("Karthik");
		students.add("Ramesh");
		
		
		for(int i=0;i<students.size();i++)
		{
			System.out.println(students.get(i));
		}
		
		System.out.println("---------------");
		
		for(String student:students)
		{
			System.out.println(student);
		}
		
		System.out.println("---------------");
		
		students.stream().forEach(ele->System.out.println(ele));
		
		System.out.println("---------------");
		
		Iterator<String> iterator=students.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		
	}

}
