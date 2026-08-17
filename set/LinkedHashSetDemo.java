package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		for(int i=0;i<=10;i++) {
			hs.add(i);
		}
		hs.add(8);
		hs.add(-2);
		hs.add(4);
		
		System.out.println(hs);
	}

}
