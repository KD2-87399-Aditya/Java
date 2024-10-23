package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.entity.AssQ1_Q2_Q3;
import com.sunbeam.exception.ExceptionLineTooLong;

public class AssiTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssQ1_Q2_Q3 s = new AssQ1_Q2_Q3();
		System.out.println("Enter description:");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		try {
			s.setString(string);
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		System.out.println("Program completed successfully");

	}

}
