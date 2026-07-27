package Blocks;

public class Demo {
	{
		System.out.println("This is instance block 6");
	}
	static {
		System.out.println("Hey.....This is static block 1");
	}
	static {
		System.out.println("hey....This is static block 2");
	}
	public Demo() {
		System.out.println("Hey...u forgot me....3");
	}
	
	{
		System.out.println("Hii....4");
	}
	
	public static void main(String[] args) {
		System.out.println("hey i am main method....5");
		Demo d = new Demo();
	}
	

}
