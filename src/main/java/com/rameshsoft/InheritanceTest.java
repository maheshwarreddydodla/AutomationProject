package com.rameshsoft;

class CommonServices
{
	
	public void login()
	{
		System.out.println("login");
	}
	public void logout()
	{
		System.out.println("logout");
	}
	
}

class TestOne extends CommonServices
{
	public void electronics()
	{
		System.out.println("electronics");
	}
}

class TestTwo extends CommonServices
{
	public void men()
	{
		System.out.println("men");
	}
	public void women()
	{
		System.out.println("women");
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		
		CommonServices commonServices=new CommonServices();
		commonServices.login();
		commonServices.logout();
		
		TestOne testOne=new TestOne();
		testOne.login();
		testOne.logout();
		testOne.electronics();
		
		CommonServices commonServices2=new TestOne();
		commonServices2.login();
		commonServices2.logout();
		
		//TestOne testOne2=new CommonServices();
		
		
	}
}
