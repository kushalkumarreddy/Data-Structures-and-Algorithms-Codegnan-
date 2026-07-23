package Scanner;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
		int eid = sc.nextInt();
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		sc.next();
		
		System.out.print("Enter Full Name: ");
		String fullname = sc.nextLine();
		sc.next();
		
		System.out.print("Enter Mateiral Status: ");
		String status = sc.nextLine();
		sc.next();
		
		System.out.print("Enter Salary: ");
		double sal = sc.nextDouble();
		sc.next();
		
		System.out.print("Address: ");
		String add = sc.nextLine();
		sc.next();
		
		System.out.print("ATM PIN Number: ");
		int pin = sc.nextInt();
		sc.next();
		
		System.out.print("Annual Salary: ");
		double asal = sc.nextDouble();
		sc.next();
		
		System.out.print("Increment: ");
		int inc = sc.nextInt();
		sc.next();
		
		System.out.print("Height of the Employee: ");
		int height = sc.nextInt();
		sc.next();
		
		System.out.print("Employee Phone Number: ");
		long phno = sc.nextLong();
		sc.next();
		
		System.out.println("Aadhar Number: ");
		long aadhar = sc.nextLong();
		
		
		
		
		System.out.println("Employee ID: "+eid);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Full Name: "+fullname);
		System.out.println("Employee Mateiral Status: "+status);
		System.out.println("Employee Salary: "+sal);
		System.out.println("Employee Address: "+add);
		System.out.println("Employee PIN Number: "+pin);
		System.out.println("Employee Annual Salary: "+asal);
		System.out.println("Increment: "+inc);
		System.out.println("Height of the Employee: "+height);
		System.out.print("Employee Phone Number: "+phno);
		System.out.println("Aadhar Number: "+aadhar);
		
		sc.close();
	}

}
