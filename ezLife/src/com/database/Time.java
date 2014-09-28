package com.database;

public class Time {
	private String year;
	private String month;
	private String day;
	private String hour;
	private String minutes;
	
	public Time(String year, String month, String day, String hour, String minutes) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minutes = minutes;
	
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public void setMonth(String month) {
		this.month = month;
	}
	
	public void setDay(String day) {
		this.day = day;
	}
	
	public void setHour(String hour) {
		this.hour = hour;
	}
	
	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}
	
	public String getYear() {
		return year;
	}
	
	public String getMonth() {
		return month;
	}
	
	public String getDay() {
		return day;
	}
	
	public String getHour() {
		return hour;
	}
	
	public String getMinutes() {
		return minutes;
	}
	
	public double totalHour() {
		int min = Integer.parseInt(minutes);
		int hr = Integer.parseInt(hour);
		double dhr = hr + (min + 0.0)/60;
		return dhr;
	}
	
	public String toString(){
		return year+" "+month+" "+day+" "+hour+" "+minutes;
	}
	public String fomstring(){
		return year+" year "+month+" month "+day+" day "+hour+" hour "+minutes;
	}
	
	
}
