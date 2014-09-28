package com.database;

public class Job {

	private String name;
	private Time startTime;
	private Time endTime;
	
	private boolean repeat;
	
	public Job(String name, Time st, Time et,  boolean rt){ //course,workout
		this.name = name; 
		startTime = st;
		endTime = et;
		repeat = rt;
	}
	
	public Job(String name, Time st, boolean rt) { //due day, activity
		this.name = name;
		startTime = st;
		String year = st.getYear();
		String month = st.getMonth();
		String day = st.getDay();
		String hour = st.getHour();
		String min = st.getMinutes();
		int temp = Integer.parseInt(min);
		temp += 15;
		min = temp + "";
		endTime = new Time(year,month,day,hour,min);
		repeat = rt;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setstart(Time st){
		startTime = st;
	}
	
	public void setend(Time et){
		endTime = et;
	}
	

	public String getName(){
		return name;
	}
	
	public Time getstart() {
		return startTime;
	}
	
	public Time getend() {
		return endTime;
	}
	

	public String toString(){
		return name+" "+startTime.toString()+" "+endTime.toString()+" "+repeat;
	}
}
