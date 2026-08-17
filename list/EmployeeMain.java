package list;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(101, "Nikhil", 30000));
		employees.add(new Employee(102, "Karthik", 35000));
		employees.add(new Employee(103, "Teja", 40000));

		System.out.println("Employees: " + employees);
		
		employees.add(1, new Employee(104, "Arjun", 32000));
		System.out.println("After adding: " + employees);

		System.out.println("Employee at index 2: " + employees.get(2));
		
		employees.set(2, new Employee(105, "Bharath", 45000));
		System.out.println("After updating: " + employees);

		employees.remove(1);
		System.out.println("After removing: " + employees);

		System.out.println("Number of employees: " + employees.size());

		System.out.println("Contains employee: " + employees.contains(employees.get(0)));

		System.out.println("Is ArrayList empty? " + employees.isEmpty());

		employees.clear();
		System.out.println("After clear: " + employees);

		System.out.println("Is ArrayList empty? " + employees.isEmpty());
	}

}
