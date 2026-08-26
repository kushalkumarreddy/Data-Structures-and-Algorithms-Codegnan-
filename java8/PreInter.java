package java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class PreInter {
	public static void main(String[] args) {
		
		Predicate<Integer> p = x-> x%2 == 0;
		System.out.println(p.test(12));
		System.out.println(p.test(67));
		System.out.println(p.test(17));
		System.out.println(p.test(18));
		
		String[] names = {"devasena","bahubali","keer","kattapa"};
		
		Predicate<String> p1 = s -> s.length()>6;
		
		for(String st:names) {
			if(p1.test(st)) {
				System.out.println(st);
			}
		}
		
		Function<Integer,Integer> f1 = i -> i*1;
		System.out.println(f1.apply(2));
		System.out.println(f1.apply(12));
		System.out.println(f1.apply(22));
		System.out.println(f1.apply(32));
		
	}

}
