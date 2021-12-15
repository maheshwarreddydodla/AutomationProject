package com.rameshsoft;

public class OverLoadTest {

	public void add() {
		System.out.println("0 arg method");
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("int arg method " + c);
	}

	public void add(float a, float b) {
		float c=a+b;
		System.out.println("float arg method "+c);

	}

	public static void main(String[] args) {

		OverLoadTest overLoadTest = new OverLoadTest();
		overLoadTest.add();
		overLoadTest.add(10,10);
		overLoadTest.add(3.14f,3.14f);
		overLoadTest.add('a','b');

	}

}
