package com.switchExpression;

public class Example3 {

	public static void main(String[] args) {

		byte value = '1';

		String output = switch(value)
		{
			
			case 'B', 'C', 'D', 'b', 'd' -> "consonents";
			
			case 'a', 'e', 'i', 'o', 'u', 'A', 'I' -> "vowels";
			
			default -> "enter valid character";

		};
		
		System.out.println(output);

	}

}
