package timedateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TimeDateApi1 {

	public static void main(String[] args) {
		
	   //the current date
		
		LocalDate date=LocalDate.now();
		System.out.println("The current date is : "+date);
		
		//the current time
		LocalTime time =LocalTime.now();
		System.out.println("The current date is : "+time);
		
		//local date and time
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println("The current date and time  is : "+datetime);
		
		//to print iin a particular format
		LocalDateTime dt=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatedType=dt.format(formatter);
		System.out.println("The current formatted date and time  is  : "+formatedType);
		
		//to get day month year 
		Month month=dt.getMonth();
		int day=dt.getDayOfMonth();
		int year=dt.getYear();
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
		
		

	}

}
