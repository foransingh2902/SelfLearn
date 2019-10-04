package org.constructors.demo;

public class ClassA {
	private String str;
	public ClassA() {
		// constructor call will keep moving up the hierarchy until Object class is
		// reached
		System.out.println("constructor of classA");
	}

	public ClassA(int a) {
		System.out.println("parameterized constructor in ClassA :" + a);
	}

	public ClassA(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}
}
