package com.rameshsoft;

public class OverLoadTestOne {
	
	public void hello(String s)
	{
		System.out.println(s);
	}
	
	public void hello(Object o)
	{
		System.out.println(o);
	}
	
	public void hello(StringBuffer sb)
	{
		System.out.println(sb);
	}
	public static void main(String[] args) {
		
		OverLoadTestOne overLoadTestOne=new OverLoadTestOne();
		overLoadTestOne.hello("String-mahesh");
		overLoadTestOne.hello(20);
		overLoadTestOne.hello(new StringBuffer("StringBuffer-Testing"));
		
		
	}

}
