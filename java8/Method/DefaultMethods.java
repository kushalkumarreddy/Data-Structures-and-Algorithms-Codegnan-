package java8.Method;

interface A {
    void m1();
    public default void sleeping() {
        System.out.println("Sleeping with dreamzzz...");
    }
}

public class DefaultMethods implements A {
	
    @Override
    public void m1() {
        System.out.println("Eating in the class");
    }

    public void sleeping() {
        System.out.println("Sleeping with dreamzzz along with eating...");
    }

    public static void main(String[] args) {
        DefaultMethods d = new DefaultMethods();

        d.m1();
        d.sleeping();
    }
}