package com.rameshsoft;

class OverrideTestOne2
{
	private void display()
	{
		System.out.println("Parent class display method");
	}
}
public class OverrideStopTest extends OverrideTestOne2 {
	

	private void display()
	{
		System.out.println("Child class display method");
	}

	public static void main(String[] args) {
		
		OverrideStopTest overrideStopTest=new OverrideStopTest();
		overrideStopTest.display();
	}

}
