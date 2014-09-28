package com.database;

public class Person {

	private int level;
	private String name;
	private String[] app;
	private int appcount;
	
	public Person(String name){
		this.name = name;
		level = 0;
		app = new String[20];
		for(int i = 0; i < 20; i ++){
			app[i] = "";
		}
		appcount = 0;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setlevel(int l){
		level = l;
	}
	
	public void addapp(String a){
		app[appcount] = a;
		appcount++;
		
	}
	
	public String getname(){
		return name;
	}
	
	public int getlevel(){
		return level;
	}
	
	public String[] getapparray(){
		return app;
	}
	
	public boolean hasApp(String a){
		boolean n = false;
		for(int i = 0; i < 20; i++){
			if(app[i].equals(a)){
				return true;
			}
		}
		return false;
	}
}
