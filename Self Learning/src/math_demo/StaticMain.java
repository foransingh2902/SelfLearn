package math_demo;

public class StaticMain {
	public static void main(String[] args) {
		System.out.println(StaticDemo.count);
		StaticDemo ob1 = new StaticDemo("hello");
		System.out.println(StaticDemo.count);
	}
}
