package com.rameshsoft;
class OverrideTestOne
{
	public void display(String s)
	{
		System.out.println("parent class display method");
	}
	
	public void hello()
	{
		System.out.println("parent class hello method");
	}
	
	public static void print()
	{
		System.out.println("parent class print method");
	}
}
public class OverrideTest extends OverrideTestOne {
	
	
	public void display(String s)
	{
		System.out.println("child class display method");
	}
	public static void print()
	{
		System.out.println("child class print method");
	}
	
	public static void main(String[] args) {
		
//		OverrideTest overrideTest=new OverrideTest();
//     	overrideTest.display("Mahesh");
//     	overrideTest.print();
//     	
//     	System.out.println();
     	OverrideTestOne overrideTestOne=new OverrideTest();
     	overrideTestOne.hello();
     	overrideTestOne.display("Mahesh");
     	overrideTestOne.print();
     	
		
	}
	
	
	
	

}
