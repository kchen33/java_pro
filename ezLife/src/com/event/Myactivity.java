package com.event;
import com.database.*;

public interface Myactivity {

	public void setName(String n);
	public void setST(Time st);
	public void setRT(boolean rt);
	public String getName();
	public Time getST();
	public boolean getRT();
	public Job getevent();
}
