package com.tod.oracle;

public class StringOperations {

	public static void main(String[] args) {
		String string2 = "World";
		String string3 = " ";
		string3 = "Hello".concat(string2);
		
		// Get Length
		System.out.println("Length : " + string3.length());
		
		// Get SubString
		System.out.println("Sub : " + string3.substring(0, 5));
		
		// Uppercase
		System.out.println("Uppercase : " + string3.toUpperCase());

	}

}
