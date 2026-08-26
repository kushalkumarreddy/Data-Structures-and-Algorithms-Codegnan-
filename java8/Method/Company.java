package java8.Method;

interface Employee {

    void work();

    // static method
    static void companyName() {
        System.out.println("ABC Company");
    }
}

class Developer implements Employee {

    @Override
    public void work() {
        System.out.println("handling some bug...");
    }
}

public class Company {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.work();
        Employee.companyName();
    }
}