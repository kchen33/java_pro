package com.social;

import java.io.*;

import com.database.*;

public interface Myrelation {
	// facebook 0, twitter 1, instgram 2
	public String[][] friendrela(String file) throws Exception;
	public void addFriend(String[][] a);
	public Person[] sortFriend();
	
}
