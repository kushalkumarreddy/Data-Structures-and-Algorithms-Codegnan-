package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {
	 public static void main(String[] args) {

	        // 1. ARRAY

	        int[] numbers = {10, 25, 30, 15, 40, 50};

	        System.out.println("Array elements:");

	        Arrays.stream(numbers)
	              .forEach(n -> System.out.println(n));


	        // 2. LIST

	        List<Integer> list = new ArrayList<>();

	        list.add(10);
	        list.add(25);
	        list.add(30);
	        list.add(15);
	        list.add(40);
	        list.add(50);

	        // Collections
	        Collections.sort(list);

	        System.out.println("\nSorted List:");
	        System.out.println(list);


	        // Stream: filter even numbers
	        List<Integer> evenNumbers = list.stream()
	                .filter(n -> n % 2 == 0)
	                .collect(Collectors.toList());

	        System.out.println("\nEven Numbers:");
	        System.out.println(evenNumbers);


	        // Stream: find numbers greater than 25
	        List<Integer> greater = list.stream()
	                .filter(n -> n > 25)
	                .collect(Collectors.toList());

	        System.out.println("\nNumbers greater than 25:");
	        System.out.println(greater);


	        // Stream: map
	        List<Integer> doubled = list.stream()
	                .map(n -> n * 2)
	                .collect(Collectors.toList());

	        System.out.println("\nDoubled Numbers:");
	        System.out.println(doubled);


	        // 3. COMPARATOR

	        List<Integer> numbers2 = new ArrayList<>(
	                Arrays.asList(50, 10, 40, 20, 30)
	        );

	        // Sort using Comparator
	        numbers2.sort(Comparator.naturalOrder());

	        System.out.println("\nAscending:");
	        System.out.println(numbers2);

	        numbers2.sort(Comparator.reverseOrder());

	        System.out.println("Descending:");
	        System.out.println(numbers2);


	        // 4. MAP

	        Map<Integer, String> employees = new HashMap<>();

	        employees.put(101, "Kushal");
	        employees.put(102, "Rahul");
	        employees.put(103, "Anil");
	        employees.put(104, "Suresh");

	        System.out.println("\nEmployees:");

	        employees.entrySet()
	                .stream()
	                .forEach(e ->
	                        System.out.println(e.getKey() + " : " + e.getValue())
	                );


	        System.out.println("\nEmployees with ID > 102:");

	        employees.entrySet()
	                .stream()
	                .filter(e -> e.getKey() > 102)
	                .forEach(e ->
	                        System.out.println(e.getKey() + " : " + e.getValue())
	                );


	        // 5. COLLECTIONS + STREAM

	        List<String> names = new ArrayList<>(
	                Arrays.asList("Kushal", "Rahul", "Anil", "Suresh")
	        );

	        // Collections reverse
	        Collections.reverse(names);

	        System.out.println("\nReversed List:");
	        System.out.println(names);


	        // Stream sorting
	        System.out.println("\nNames sorted using Stream:");
	
	        names.stream()
	                .sorted()
	                .forEach(System.out::println);
	        
	    }

}
