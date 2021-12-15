package com.rameshsoft;


class VarArgOne{
	
//	public void hello(int a)
//	{
//		System.out.println("int arg method: "+a);
//	}
	
	public void hello(int... a)
	{
		System.out.println("var arg method");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
public class VarArgTest {

	public static void main(String[] args) {
		
		VarArgOne varArgOne=new VarArgOne();
		varArgOne.hello(10);
		varArgOne.hello(10,20,30,40);
		varArgOne.hello();
	}
}
