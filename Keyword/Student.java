package Keyword;

public class Student {
	
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Student st = new Student("Bahubali");
		st.display();
	}

}
