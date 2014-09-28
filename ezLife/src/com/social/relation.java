package com.social;
import java.io.*;

import com.database.*;

public class relation implements Myrelation{
	
	private int app;
	private String[][] friends;
	private int[] friendsCount;
	private Person[] per ;
	private int tempi;
	
	
	public relation() {
		friends = new String[3][500];
		friendsCount = new int[3];
		per = new Person[friendsCount[0] + friendsCount[1] + friendsCount[2]];
	}
	@Override
	public String[][] friendrela(String file) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		if (file.equals("facebook.txt")) {
			app = 0;
		}
		else if (file.equals("twitter.txt")) {
			app = 1;
		}
		else if (file.equals("instgram.txt")) {
			app = 2;
		}
		else {
			app = -1;
		}
		while ((line = br.readLine()) != null) {
			if (app != -1) {
				friends[app][friendsCount[app]] = line;
				friendsCount[app]++;
			}
		}
		return friends;
		
		
	}
	
	@Override
	public void addFriend(String[][] a) {
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length;j++) {
				if (friends[i][j] != null && !hasPerson(friends[i][j])){
					Person temperson = new Person(friends[i][j]);
					per[temp] = temperson;
					temp++;
				}
			}
		}
	}

	@Override
	public Person[] sortFriend() {
		// TODO Auto-generated method stub
		Person[] sortPer = per;
		for(int i = 1; i < per.length; i++){
			for(int j = i-1; j >0; j++){
				if(per[j].getlevel()>per[j+1].getlevel()){
					swipPerson(sortPer, j, j+1);
				}
			}
		}
		
		return sortPer;
	}
	
	public void swipPerson(Person[] p, int i, int j){
		Person tempa = p[i];
		p[i] = p[j];
		p[j] = tempa;
	}
	
	public boolean hasPerson(String a){
		boolean test = false;
		for(int i = 0; i < per.length; i ++){
			if(per[i].getname() == a){
				per[i].setlevel(per[i].getlevel()+1);
				return true;
			}
		}
		
		return test;
	}

}
