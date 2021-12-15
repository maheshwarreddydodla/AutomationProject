package com.rameshsoft;

class HasAOne
{
	public void hello()
	{
		System.out.println("Hello Method");
	}
}

class HasATwo
{
	public void display()
	{
		HasAOne hasAOne=new HasAOne();
		hasAOne.hello();
	}
}
public class HasTest {
	
	public static void main(String[] args) {
		HasATwo hasATwo=new HasATwo();
		hasATwo.display();
	
		
	}

}
