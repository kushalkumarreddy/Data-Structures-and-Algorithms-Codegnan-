package list;

import java.util.ArrayList;

public class MethodsDemo {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("nikhil");
		al.add("karthik");
		al.add("teja");
		System.out.println(al);
		
		al.add(1, "arjun");
		System.out.println("add method: " + al);

		System.out.println("get method: " + al.get(2));

		al.set(2, "bharath");
		System.out.println("set method: " + al);

		al.remove(1);
		System.out.println("After remove with index: " + al);
		
		al.remove("teja");
		System.out.println("After remove with name: " + al);

		al.add("teja");
		al.add("karthik");

		System.out.println("size: " + al.size());
		
		System.out.println("contains: " + al.contains("teja"));
		System.out.println("contains: " + al.contains("abcd"));
		
		System.out.println("Index of: " + al.indexOf("karthik"));
		System.out.println("Last index of: "+al.lastIndexOf("teja"));
		
		System.out.println("isEmpty: " + al.isEmpty());


		al.clear();
		System.out.println("After clear: " + al);

		System.out.println("isEmpty: " + al.isEmpty());
		
	}

}
