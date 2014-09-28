package com.event;

import com.database.Job;
import com.database.Time;

public class Workout implements Myworkout{
	
	private String name;
	private Time startTime;
	private Time endTime;
	
	private boolean repeat;
	
	public Workout(String name, Time st, Time et, boolean rt){
		this.name = name;
		startTime = st;
		endTime = et;

		repeat = rt;
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
	    this.name = name;
	}
	
	public void setST(Time st) {
		startTime = st;
	}
	
	public void setET(Time et) {
		endTime = et;
	}
	

	public String getName() {
		return name;
	}
	
	public Time getST() {
		return startTime;
	}
	
	public Time getET() {
		return endTime;
	}
	

	@Override
	public Job getevent() {
		// TODO Auto-generated method stub
		Job job = new Job(name, startTime, endTime, repeat);
		return job;
	}



	/*@Override
	public void addDate(String date, String st, String et) {
		// TODO Auto-generated method stub
		DateTime a= new DateTime(date,st,et);
		int temp=0;
		while(dt[temp].getdate().equals(null)){
			temp++;
		}
		dt[temp] = a;
		
		int temp1= 0;
		Job j = new Job(1,name, st,et,date);
		while(job[temp1].getdate().equals(null)){
			temp1++;
		}
		job[temp1] = j; 
		
	}*/
	
	
	
}
 
