package org.constructors.demo;

public class ClassB extends ClassA{
	public ClassB() {
		// if we don't call specific constructor using super(), then
		// by default super() is inserted by compiler in each constructor.
		System.out.println("constructor of ClassB");
	}

	public ClassB(int a) {
		super(a);
		System.out.println("parameterized constructor in ClassB:" + a);
	}

	public ClassB(String str) {
		super(str);
	}
}
