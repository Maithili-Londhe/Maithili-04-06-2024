package com.switchExpression;

public class Example4 {

	public static void main(String[] args) {

		int value = 1;

		String output = switch(value)
		{
			
			case 1 -> "Monday";
			case 2 -> "Tuesday";
			
			
			default -> "enter valid number";

		};
		
		System.out.println(output);

	}

}
