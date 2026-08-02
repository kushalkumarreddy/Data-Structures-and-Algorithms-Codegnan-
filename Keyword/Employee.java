package Keyword;

class Person {
	
	int salary = 1000000;
	public void getSalary(int salary) {
		salary = 600000;
		System.out.println("Parent salary is: "+salary);
		System.out.println("Parent class global salary: "+this.salary);
	}
}

public class Employee extends Person {
	
	int salary = 30000;
	
	public void getSalary(double salary) {
		System.out.println("My Side Salary is: "+salary);
	}
	
	public void getSalary(int salary) {
		salary = 20000;
		System.out.println(salary);//local
		System.out.println(this.salary);//global
		super.getSalary(40000);
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.getSalary(10000);
	}

}