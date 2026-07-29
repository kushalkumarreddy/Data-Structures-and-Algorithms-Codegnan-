package OOPS;

class Person{
	
	void sleep() {
		System.out.println("Person is Sleeping");
	}
}

class Employee extends Person {
	void work() {
		System.out.println("Person Working");
	}
}

class Manager extends Employee {
	void talk() {
		System.out.println("Person is talking");
	}
}

public class PersonMain {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.sleep();
		m.work();
		m.talk();
	}

}
