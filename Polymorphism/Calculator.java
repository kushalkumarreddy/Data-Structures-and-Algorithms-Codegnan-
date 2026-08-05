package Polymorphism;

public class Calculator {
	
	public void addition(int a, int b) {
		System.out.println("Addition of two int values: "+(a+b));
	}
	
	public void addition(int a, int b, int c) {
		System.out.println("Addition of three int values: "+(a+b+c));
	}
	
	public void addition(float a, float b) {
		System.out.println("Addition of two float values: "+(a+b));
	}
	
	public void addition(float a, float b, float c) {
		System.out.println("Addition of two float values: "+(a+b+c));
	}
	
	public static void main(String[] args) {
		Calculator ct = new Calculator();
		ct.addition(1, 2, 3);
		ct.addition(5,9);
		ct.addition(2.3f, 23.2f, 25.3f);
	}

}
