package com.switchExpression;

public class Example1 {

	public static void main(String[] args) {

		String day = "sunday";

		switch(day.toLowerCase())
		{
			case "monday":
			case "tuesday":
			case "wednesday":
			case "thursday":
			case "friday":
	
				System.out.println("Working day");
				break;
			case "saturday":
			case "sunday":
				System.out.println("Holiday");
				break;
			default:
				System.out.println("enter valid day");

		}

	}

}
