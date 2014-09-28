package com.study;
import com.database.*;

public interface myCourses {

	public void setName(String name);
	public void setST(Time st);
	public void setET(Time et);
	public String getName();
	public Time getST();
	public Time getET();
	public Job getevent();
}
