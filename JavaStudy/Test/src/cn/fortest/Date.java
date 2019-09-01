package cn.fortest;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Date {

	public static void main(String[] args) {
		
		date();
		
		System.out.println("--------------");
		nm();
	}
	
	public static void date(){
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println(cal.getTime());
		
		System.out.println(cal.getTimeInMillis());
		cal.add(Calendar.DATE, -1);
		System.out.println(cal.getTime());
	}

	
	public static void nm(){
		
		LocalDateTime ldt = LocalDateTime.now();
		LocalDateTime s = ldt.minusDays(1);
		
		System.out.println(s);
		
	

	}
		
	
	
}
