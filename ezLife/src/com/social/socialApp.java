package com.social;
import com.database.*;

public class socialApp implements MysocialApp {
	private boolean[] selectApp;
	private int selectedCount;
	
	public socialApp() {
		selectApp = new boolean[3]; 
	}
	@Override
	public void addselectApp(int a) {
		selectApp[a] = true;
		selectedCount++;
	}

	@Override
	public void sendMessageNow(boolean[] a, String message) {
		// TODO Auto-generated method stub
		String temp = "";
		if (a[0])
			temp += " facebook";
		if (a[1])
			temp += " twitter";
		if (a[2])
			temp += " instgram";
		System.out.println("\"" + message + "\" is sent to" + temp);
	}

	/*@Override
	public void sendMessageLater(boolean[] a, String message, String sendTime) {
		// TODO Auto-generated method stub
		
	}*/
	
	
}
