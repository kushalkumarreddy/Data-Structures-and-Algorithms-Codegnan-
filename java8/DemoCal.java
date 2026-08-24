package java8;

@FunctionalInterface
interface Calc {
	int square (int x);
}
	
class DemoExist {		
	public int solved(int val) {			
	return val * val;
	}
}

public class DemoCal {
	public static void main(String[] args) {
		Calc c = x -> x*x;
		System.out.println(c.square(2));
		
		DemoExist de = new DemoExist();
		
		Calc ct = de ::solved;
		System.out.println(ct.square(3));
	}

}
