package Array;

public class EmployeeDemo {
	public static void main(String[] args) {
		
		Employee e  = new Employee(123,"Keerthi");
		Employee e1 = new Employee(456,"Suresh");
		Employee e2 = new Employee(345,"bahu");
		Employee e3 = new Employee(324,"bali");
		Employee e4 = new Employee(879,"sena");
		
		Employee emps[] = {e,e1,e2,e3,e4};
		
		for(Employee ee : emps) {
			System.out.println(ee);
		}
		
	}

}
