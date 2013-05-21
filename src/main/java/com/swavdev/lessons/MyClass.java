package com.swavdev.lessons;

import java.lang.System;

/**
* This is our test
**/
public class MyClass {


	private String mName;

	private int mDaily;

	private int mDaysInMonth;

	private int mMonthsInYear;
	
	private static final TAG = "MyClass";

	public static void main (String[] args){
		MyClass myClass = new MyClass (args[0], 400);
		myClass.printWelcome();
		myClass.printTotalIncome();
	}

	public MyClass (String name, int daily) {
		mDaily = daily;
		mDaysInMonth = 20;
		mMonthsInYear = 12;
		mName = name;
	}

	public void printWelcome(){
		System.out.println ("Welcome " + mName + "!");
	}

	public void printTotalIncome(){
		int totalIncome;
		totalIncome = mDaily * mDaysInMonth * mMonthsInYear;
		System.out.println ("Total Income:" + totalIncome);
	}

}
