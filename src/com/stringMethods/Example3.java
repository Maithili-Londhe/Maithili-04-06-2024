package com.stringMethods;

public class Example3 {

	public static void main(String[] args) {


		String text = "Welcome to Java Programming";

		char characters[] = text.toCharArray();

		for(int i = 0; i < characters.length; i++)
		{
			if(Character.isUpperCase(characters[i]))
			{
				System.out.println(characters[i]);
			}
		}
		
		

	}

}
