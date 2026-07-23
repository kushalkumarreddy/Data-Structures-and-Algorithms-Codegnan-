package Intro;

public class Employee {
		int EmployeeId = 101;
		String Employeename = "Kushal";
		double EmployeeSalary = 100000.0;
		String EmployeeCompanyName = "Codegnan";
		
		public static void main(String[] args) {
			Employee emp = new Employee();
			
			System.out.println("Employee Details");
			System.out.println("Id: "+emp.EmployeeId);
			System.out.println("Name: "+emp.Employeename);
			System.out.println("Annual Salary: "+emp.EmployeeSalary*12);
			System.out.println("Company Name: "+emp.EmployeeCompanyName);
	}

}