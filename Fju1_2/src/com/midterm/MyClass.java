package com.midterm;

public class MyClass {
	static int a = 200;
	
	public static void main(String[] args) {
		MyClass c = new MyClass();
		System.out.println(c.a);
		c.a = 300;
		MyClass d = new MyClass();
		System.out.println(d.a);
	}
	
}
