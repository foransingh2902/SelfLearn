package math_demo;

public class MathDemo extends Math1 {
	public static void display(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		int x = Math.round(42.2f);
		System.out.println("Round of " + x);
		// inside class static won't even need a class name
		display("hello");
		Math1 m1 = new Math1();
		System.out.println(m1.getNum1());
		Math1 m2 = new Math1(20, 0);
		System.out.println("variables values :" + m2.getNum1() + " " + m2.getNum2());
	}
}
