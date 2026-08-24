package java8;

import java.util.ArrayList;
import java.util.Collections;

class Employee {

    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee(123, "Sathya"));
        al.add(new Employee(456, "Bahu"));
        al.add(new Employee(952, "Deva"));

        System.out.println(al);

        Collections.sort
        (al, (e1, e2) -> (e1.id > e2.id) ? -1 : (e1.id < e2.id) ? 1 : 0);

        System.out.println(al);
    }
}