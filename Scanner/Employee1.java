package Scanner;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Employee1 {
	public static void main(String[] args) {
		
		
		
//		byte experience = 0;
//		short departmentId = 0;
//		int employeeId = 0;
//		long mobileNum = 0;
//		float height = 0;
//		double salary = 0;
//		boolean filePresent = false;
//		BigInteger aadhar = BigInteger.ZERO;
//		BigDecimal bonus = BigDecimal.ZERO;
//
//		String employeeSurName = " ";
//		String employeeFullName = " ";
//		char maritalStatus=' ';

		int id = 0;
		String name = "";
		String fullname = "";
		String status = "";
		double salary = 0;
		String address = "";
		double increment = 0;
		double height = 0;
		Long phone = 0L;
		char ch = ' ';
		BigInteger aadhar = BigInteger.ZERO;
		BigDecimal bonus = BigDecimal.ZERO;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id: ");
		if (sc.hasNext()) {
			id = sc.nextInt();
		} else {
			System.out.println("inavlid id");
		}

		System.out.println("Enter name: ");
		if (sc.hasNext()) {
			name = sc.next();
		} else {
			System.out.println("invalid name");
		}
		sc.nextLine();

		System.out.println("Enter full name: ");
		if (sc.hasNext()) {
			fullname = sc.nextLine();
		} else {
			System.out.println("invalid ");
		}

		System.out.println("Enter the Martial status:");
		if (sc.hasNext()) {
			status = sc.next();
		} else {
			System.out.println("invalid maritial status");
		}

		System.out.println("Enter your salary: ");
		if (sc.hasNext()) {
			salary = sc.nextDouble();
		} else {
			System.out.println("inavlid salary");
		}

		sc.nextLine();

		System.out.println("Enter your address");
		if (sc.hasNext()) {
			address = sc.nextLine();
		} else {
			System.out.println("invalid address");
		}

		System.out.println("Enter your Increment: ");
		if (sc.hasNext()) {
			increment = sc.nextDouble();
		} else {
			System.out.println("invalid increment");
		}

		System.out.println("Enter your height");
		if (sc.hasNext()) {

			height = sc.nextDouble();
		} else {
			System.out.println("invalid height");
		}

		System.out.println("Enter the phone number: ");
		if (sc.hasNext()) {
			phone = sc.nextLong();
		} else {
			System.out.println("invalid phonenumber");
		}
		System.out.println("Enter your aadhar number: ");
		if (sc.hasNext()) {
			aadhar = sc.nextBigInteger();
		} else {
			System.out.println("Invalid aadhar");
		}
		System.out.println("Enter your Bonus: ");
		if (sc.hasNext()) {
			bonus = sc.nextBigDecimal();
		} else {
			System.out.println("Invalid aadhar");
		}
		System.out.println("Enter the gender");
		if (sc.hasNext()) {
			ch = sc.next().charAt(0);
		} else {
			System.out.println("invalid gender");
		}

		System.out.println("EMPLOYEE DETAILS");
		System.out.println("Employee ID         : " + id);
		System.out.println("Employee name       : " + name);
		System.out.println("Employee Full name  : " + fullname);
		System.out.println("Martial status      : " + status);
		System.out.println("Employee gender     : " + ch);
		System.out.println("Employee salary     : " + salary);
		System.out.println("Employee address    : " + address);
		System.out.println("Employee increment  : " + increment);
		System.out.println("Employee height     : " + height);
		System.out.println("Employee Phonenumber: " + phone);
		System.out.println("Employee aadhar     : " + aadhar);
		System.out.println("Employee bonus      : " + bonus);

		sc.close();

	}

}