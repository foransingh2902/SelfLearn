package math_demo;

public class StaticDemo {
	static int count;
	private String name;

	public StaticDemo(String name) {
		this.name = name;
		count++;
	}

	public static void display() {
		// String temp=name;
		// can't use non static variables inside a static method
		System.out.println(count);
	}

	public void show() {
		// but non static methods can use static variables in them
		System.out.println(count);
	}
}
