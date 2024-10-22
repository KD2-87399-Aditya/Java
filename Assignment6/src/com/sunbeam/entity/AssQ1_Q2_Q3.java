package com.sunbeam.entity;

import com.sunbeam.exception.ExceptionLineTooLong;

public class AssQ1_Q2_Q3 {
	public void setString(String string) throws ExceptionLineTooLong {
		if(string.length()>80) {
			throw new ExceptionLineTooLong("The strings is too long");
	}
		isPalindrome(string);}

	public void isPalindrome(String string){
		StringBuilder reversed = new StringBuilder(string);
		String reverseString = reversed.reverse().toString();
		System.out.println("Reverse of string:"+reverseString);
		if(string .equals(reverseString) ) {
			System.out.println("It is Palindrome");
	}else{
		System.out.println("It is not palindrome");
	}}

}
