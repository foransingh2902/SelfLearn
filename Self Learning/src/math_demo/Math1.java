package math_demo;

public class Math1 {
	private int num1;
	private int num2;

	public Math1(int num1, int num2) {
		if (num1 > 0 && num2 > 0) {
		this.num1 = num1;
		this.num2 = num2;
		}
		else
		{
			System.out.println("using default values");
		}
	}

	public Math1() {
		// giving default values
		num1 = 10;
		num2 = 10;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

}
