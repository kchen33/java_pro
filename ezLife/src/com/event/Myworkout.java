package com.event;
import com.database.*;

public interface Myworkout {

	public void setName(String name);
	public void setST(Time st);
	public void setET(Time et);
	public String getName();
	public Time getST();
	public Time getET();
	public Job getevent();
}
