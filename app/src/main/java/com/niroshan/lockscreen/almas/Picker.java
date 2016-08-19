package com.niroshan.lockscreen.almas;

import android.graphics.drawable.Drawable;

public class Picker {
	
	String ss;
	Drawable dd;
	
	
	public Picker(String name , Drawable d) {
		
		ss = name;
		dd = d;
	}
	
	
	//get string name
	public String getName(){
		return ss;
	}
	
	
	//get app icon
	public Drawable getIcon() {
		return dd;
	}
	

}
