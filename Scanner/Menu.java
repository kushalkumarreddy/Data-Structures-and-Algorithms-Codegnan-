package Scanner;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Order Menu");
		System.out.println("1. Veg Biryani : 170/-");
		System.out.println("2.Pizza 	   : 290/-");
		System.out.println("3.Chicken Dum Biryani : 340/-");
		System.out.println("4.Burger       : 140/-");
		System.out.println("5.Exit");
		
		System.out.print("Enter Item Number: ");		
		int choice = sc.nextInt();
		
		System.out.println("\nYour Order Details");
		switch(choice) {
		case 1 -> System.out.println("Veg Biryani Selected\nPrice = 170/-");
		case 2 -> System.out.println("Pizza Selected\nPrice = 290/-");
		case 3 -> System.out.println("Chicken Dum Biryani Selected\nPrice = 340/-");
		case 4 -> System.out.println("Burger Selected\nPrice = 140/-");
		case 5 -> System.out.println("Exited ThankYou");
		default -> System.out.println("Select Your Order from Menu");
		}
		
		sc.close();
	}

}