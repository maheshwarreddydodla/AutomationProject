package CollectionExample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
//		int[] intArr=new int[4];
//		
//		intArr[0]=100;
//		intArr[1]=200;
//		intArr[3]=300;
//		System.out.println(intArr[4]);
		
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(1);
		al.add("Mahesh");
		al.add("3.14");
		al.add('A');
		al.add(true);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.size());
		System.out.println(al.size()-1);
		
		ArrayList<Integer> al2=new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(al2);
		
		
		
	}

}
