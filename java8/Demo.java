package java8;

interface Calculator {
    public int add(int a, int b);
}

public class Demo {
    public static void main(String[] args) {

        // Using Anonymous Inner Class
        Calculator cat = new Calculator() {

            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        System.out.println(cat.add(10, 20));

        // Using Lambda Expression
        Calculator ct = (a, b) -> {
            return a + b;
        };

        System.out.println(ct.add(12, 12));
    }
}