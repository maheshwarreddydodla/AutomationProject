package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {
	
	public static void main(String[] args) {
		
		
		String[] arr= {"JAVA","C","JAVA","C++","Selenium","Python","JAVA","C","Selenium"};
//		
//		Map<String,Integer> map=new HashMap<String,Integer>();
//		for(String str:arr)
//		{
//			if(map.containsKey(str))
//			{
//				map.put(str, map.get(str)+1);
//			}
//			else
//			{
//				map.put(str, 1);
//			}
//			
//		}
//		
//		Set<String> set=map.keySet();
//		
//	   for(String str1:set)
//	   {
//		   if(map.get(str1)>1)
//		   {
//			   System.out.println(str1+" "+map.get(str1));
//		   }
//	   }
		
//		Set<String> set=new HashSet<String>();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					set.add(arr[i]);
//					//System.out.println("Duplicate element is :"+arr[i]);
//				}
//			}
//		}
//		
//		System.out.println(set);
//		
		
		Set<String> set=new HashSet<String>();
		
	    boolean statusfalse;
	    
	    for(String str2:arr)
	    {
	    	if(set.add(str2)==false)
	    	{
	    		System.out.println("Duplicate Element: "+str2);
	    	}
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
