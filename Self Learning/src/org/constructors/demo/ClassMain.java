package org.constructors.demo;

public class ClassMain {
	public static void main(String[] args) {
		ClassB ob = new ClassB(3);
		ClassB obj1 = new ClassB("Hello");
		System.out.println(obj1.getStr());

	}
}
