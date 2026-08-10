package Strings;

public class StringMethod {
	
	public static void main(String[] args) {

        String s = "Hello Java";
        String s2 = "hello java";

        // 1. length()
        System.out.println("length(): " + s.length());

        // 2. charAt()
        System.out.println("charAt(): " + s.charAt(1));

        // 3. toUpperCase()
        System.out.println("toUpperCase(): " + s.toUpperCase());

        // 4. toLowerCase()
        System.out.println("toLowerCase(): " + s.toLowerCase());

        // 5. equals()
        System.out.println("equals(): " + s.equals(s2));

        // 6. equalsIgnoreCase()
        System.out.println("equalsIgnoreCase(): " + s.equalsIgnoreCase(s2));

        // 7. contains()
        System.out.println("contains(): " + s.contains("Java"));

        // 8. startsWith()
        System.out.println("startsWith(): " + s.startsWith("Hello"));

        // 9. endsWith()
        System.out.println("endsWith(): " + s.endsWith("Java"));

        // 10. indexOf()
        System.out.println("indexOf(): " + s.indexOf("Java"));

        // 11. lastIndexOf()
        System.out.println("lastIndexOf(): " + s.lastIndexOf("a"));

        // 12. substring()
        System.out.println("substring(): " + s.substring(6));

        // 13. substring(start, end)
        System.out.println("substring(0, 5): " + s.substring(0, 5));

        // 14. concat()
        System.out.println("concat(): " + s.concat(" Programming"));

        // 15. replace()
        System.out.println("replace(): " + s.replace("Java", "World"));

        // 16. replaceAll()
        System.out.println("replaceAll(): " + s.replaceAll("Java", "World"));

        // 17. trim()
        String x = "   Hello Java   ";
        System.out.println("trim(): " + x.trim());

        // 18. isEmpty()
        String empty = "";
        System.out.println("isEmpty(): " + empty.isEmpty());

        // 19. compareTo()
        System.out.println("compareTo(): " + s.compareTo(s2));

        // 20. compareToIgnoreCase()
        System.out.println("compareToIgnoreCase(): " 
                           + s.compareToIgnoreCase(s2));

        // 21. valueOf()
        int n = 100;
        String num = String.valueOf(n);
        System.out.println("valueOf(): " + num);

        // 22. toCharArray()
        char[] arr = s.toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 23. split()
        String words = "Java is easy";
        String[] a = words.split(" ");

        System.out.print("split(): ");
        for (String word : a) {
            System.out.print(word + " ");
        }
        System.out.println();

        // 24. join()
        System.out.println("join(): " + String.join("-", "Java", "Python", "C"));

        // 25. repeat()
        System.out.println("repeat(): " + "Hi ".repeat(3));
    }

}
