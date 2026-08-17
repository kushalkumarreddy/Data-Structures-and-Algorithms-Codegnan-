package set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
//		LinkedHashSet hs = new LinkedHashSet();
		for(int i=0;i<=10;i++) {
			hs.add(i);
		}
		hs.add(8);
		hs.add(-2);
		hs.add(4);
		
		System.out.println(hs);
	}

}
