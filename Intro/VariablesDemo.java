package Intro;

public class VariablesDemo {
	
	//global variable
	int age = 100;
	static String school = "Schoooool";
	
	public static void main(String[] args) {
		int age = 90;
		System.out.println("My age is: "+age);		
		VariablesDemo t = new VariablesDemo(); //object creation
		System.out.println("My global age is: "+t.age);
		System.out.println("My school name is: "+VariablesDemo.school);
	}

}
