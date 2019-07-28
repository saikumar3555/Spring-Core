package com.nit.main;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	private Calendar cal=null;
	
	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	//To Get Date
	public void getDate() {
		Date d=cal.getTime();
		System.out.println(d);
	}
	
	//To add/remove no of days to date
	public void toGetNoOfDays(Date d,int days) {
		//seting date to calender object
		cal.setTime(d);
		//add days to current date
		cal.set(Calendar.DAY_OF_MONTH,days);
		//getting modified Date
		Date finalDate=cal.getTime();
		System.out.println(finalDate);
		
		
		
		
	}
	

}
