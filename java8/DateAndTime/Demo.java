package java8.DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
		
		LocalDate sd = date.of(1994, 06, 05);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(format);
	}

}
