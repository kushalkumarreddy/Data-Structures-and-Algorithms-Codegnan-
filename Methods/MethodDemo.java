package Methods;

public class MethodDemo {
	public static void method1()
	{
		System.out.println("welcome");
	}


	public static int method2()
	{
		return 78;
	}


	public static void method3(int age)
	{
		System.out.println("my age is :"+age);
	}


	public static int method4(String s)
	{
		return s.length();
	}
	
	public static double salary(int salary) {
		return salary;
	}
	
	public static void main(String args[]) {
		MethodDemo md = new MethodDemo();
		md.method1();
		md.method2();
		md.method3(78);
		md.method4("pushpa");
		System.out.println(md.salary(898));


	}
	

}
