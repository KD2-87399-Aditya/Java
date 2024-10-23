package com.sunbeam.p1;

import java.util.Arrays;
import java.util.Scanner;

//import com.sunbeam.p1.StuRollComparatorDesc.StuMarksComparatorDesc;

public class Program1 {

	public static int menu(Scanner scanner) {
		System.out.println("0. EXIT");
		System.out.println("1. Display All Students");
		System.out.println("2. Display Students Sorted by City (Asc)");
		System.out.println("3. Display Students Sorted by Marks (Desc)");
		System.out.println("4. Display Students Sorted by Name (Asc)");
		System.out.println("5. Display Students Sorted by Roll Number");
		return scanner.nextInt();
	}

	public static void displayAllStudents(Student[] students) {
		System.out.println("*************************");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println("*************************");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student[] students = { new Student(5, "Alice", "New York", 85.5), new Student(1, "Bob", "Los Angeles", 90.0),
				new Student(4, "Charlie", "New York", 70.5), new Student(3, "David", "Chicago", 88.0),
				new Student(2, "Eve", "Chicago", 95.0) };

		int choice;
		while ((choice = menu(scanner)) != 0) {
			switch (choice) {
			case 1:
				displayAllStudents(students);
				break;
			case 2:
				Arrays.sort(students, new StuCityComparatorAsc());
				displayAllStudents(students);
				break;
			case 3:
				Arrays.sort(students, new StuMarksComparatorDesc());
				displayAllStudents(students);
				break;
			case 4:
				Arrays.sort(students, new StuNameComparatorAsc());
				displayAllStudents(students);
				break;
			case 5:
				Arrays.sort(students, new StuRollComparatorDesc());
				displayAllStudents(students);
				break;
			default:
				System.out.println("Wrong choice...");
				break;
			}
		}
		scanner.close();
	}
}
