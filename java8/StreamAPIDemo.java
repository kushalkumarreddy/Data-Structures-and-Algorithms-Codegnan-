package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAPIDemo {
	public static void main(String[] args) {

        // List of numbers
        List<Integer> numbers = Arrays.asList(
                10, 20, 30, 20, 40, 50, 60, 30
        );

        // List of names
        List<String> names = Arrays.asList(
                "Kushal", "Rahul", "Anil", "Suresh", "Amit"
        );

	
        // 1. forEach()

        System.out.println("All Numbers:");

        numbers.stream()
               .forEach(System.out::println);


        // 2. count()

        long length = numbers.stream().count();

        System.out.println("\nLength:");
        System.out.println(length);


        // 3. map()
        // Multiply every number by 2

        System.out.println("\nNumbers multiplied by 2:");

        numbers.stream()
               .map(l -> l * 2)
               .forEach(System.out::println);

        // 4. filter() + count()
        // Find failed students

        long failedStudents = numbers.stream()
                .filter(marks -> marks < 40)
                .count();

        System.out.println("\nFailed Students:");
        System.out.println(failedStudents);


        // 5. sorted()
        // Ascending order

        System.out.println("\nNames in Ascending Order:");

        names.stream()
             .sorted()
             .forEach(System.out::println);


        // 6. sorted(Comparator.reverseOrder())
        // Descending order

        System.out.println("\nNames in Descending Order:");

        names.stream()
             .sorted(Comparator.reverseOrder())
             .forEach(System.out::println);


        // 7. filter() + distinct()
        // Even numbers without duplicates

        System.out.println("\nUnique Even Numbers:");

        numbers.stream()
               .filter(n -> n % 2 == 0)
               .distinct()
               .forEach(System.out::println);


        // 8. limit()
        // Print first 3 numbers

        System.out.println("\nFirst 3 Numbers:");

        numbers.stream()
               .limit(3)
               .forEach(System.out::println);


        // 9. skip()
        // Skip first 3 numbers

        System.out.println("\nAfter Skipping First 3 Numbers:");

        numbers.stream()
               .skip(3)
               .forEach(System.out::println);


        // 10. max()
        // Find maximum number

        Integer maxValue = numbers.stream()
                .max((l1, l2) -> l1.compareTo(l2))
                .get();

        System.out.println("\nMaximum Value:");
        System.out.println(maxValue);


        // 11. min()
        // Find minimum number

        Integer minValue = numbers.stream()
                .min((l1, l2) -> l1.compareTo(l2))
                .get();

        System.out.println("\nMinimum Value:");
        System.out.println(minValue);
    }

}
