package java8.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate tmrw = date.plusDays(1);
		System.out.println(tmrw);
		
		LocalDate nextweek = date.plusWeeks(1);
		System.out.println(nextweek);
		
		LocalDate nextm = date.plusMonths(1);
		System.out.println(nextm);
		
		System.out.println("Year: " + date.getYear());
		System.out.println("Month: " + date.getMonth());
		System.out.println("Day: " + date.getDayOfMonth());
		System.out.println("Week: " + date.getDayOfWeek());
		
		//time
		System.out.println();
		System.out.println("Time");
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println("Hours: " + time.getHour());
		System.out.println("min: " + time.getMinute());
		System.out.println("seconds: " + time.getSecond());
		System.out.println("nano: " + time.getNano());
		
		//set date time
		System.out.println();		
		LocalDate dt = date.of(1994, 06, 05);
		System.out.println(dt);
		LocalTime st = time.of(12,12,12,12);
		System.out.println(st);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(formatter);
		
		String result = dt.format(formatter);
		System.out.println(result);
		
		//between
		LocalDate bdy = LocalDate.of(1994,06,04);
		LocalDate tdy = LocalDate.now();
		
		Period period = Period.between(bdy, tdy);
		System.out.println(period.getYears()+" "+period.getMonths()+" "+period.getDays());
		
		//zone
		ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(india);
		
		ZonedDateTime usa = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(usa);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		
//		//year
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Year Number: ");
//		int n = sc.nextInt();
		
	}

}
