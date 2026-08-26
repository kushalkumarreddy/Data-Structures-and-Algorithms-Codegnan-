package java8.Method;

interface Mom {
	default void sleep() {
		System.out.println("sleep left direction");
	}
}

interface Dad {
	default void sleep() {
		System.out.println("sleep righe direction");
	}
}

public class Baby implements Dad,Mom {
	@Override
	public void sleep() {
		System.out.println("i can sleep my own");
		Mom.super.sleep();
		Dad.super.sleep();
	}
	
	public static void main(String[] args) {
		
		Baby b = new Baby();
        b.sleep();
		
	}
}
