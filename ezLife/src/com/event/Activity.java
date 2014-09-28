package com.event;

import com.database.Job;
import com.database.Time;

public class Activity implements Myactivity{

	private String name;
	private Time startTime;
	private Time endTime;
	private boolean repeat;

	public Activity(String name, Time st, boolean rt){
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
	
	@Override
	public void setName(String n) {
		// TODO Auto-generated method stub
		name = n;
	}

	@Override
	public void setST(Time st) {
		// TODO Auto-generated method stub
		startTime = st;
	}

	@Override
	public void setRT(boolean rt) {
		// TODO Auto-generated method stub
		repeat = rt;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Time getST() {
		// TODO Auto-generated method stub
		return startTime;
	}

	@Override
	public boolean getRT() {
		// TODO Auto-generated method stub
		return repeat;
	}
	
	@Override
	public Job getevent() {
		// TODO Auto-generated method stub
		Job job = new Job(name, startTime, repeat);
		return job;
	}

}
