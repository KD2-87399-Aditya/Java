package com.sunbeam.p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
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

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		studentList.add(new Student(5, "Alice", "New York", 85.5));
		studentList.add(new Student(1, "John Doe", "New York", 85.5));
		studentList.add(new Student(2, "Jane Smith", "Los Angeles", 92.0));
		studentList.add(new Student(3, "Mike Johnson", "Chicago", 78.3));
		studentList.add(new Student(4, "Emily Davis", "Houston", 88.9));

		int choice;
		while ((choice = menu(scanner)) != 0) {
			switch (choice) {
			case 1:
//				displayAllStudents(students);
				break;
			case 2:
				StuCityComparatorAsc cityComp = new StuCityComparatorAsc();

				// sorting done on descending order of the elements
				Collections.sort(studentList, cityComp);

				System.out.println();
				System.out.println("After Sorting -> ");
				for (Student s : studentList)
					System.out.println(s);
				break;

			case 3:
				StuMarksComparatorDesc marksComp = new StuMarksComparatorDesc();

				// sorting done on descending order of the elements
				Collections.sort(studentList, marksComp);

				System.out.println();
				System.out.println("After Sorting -> ");
				for (Student s : studentList)
					System.out.println(s);
				break;
			case 4:
//				Arrays.sort(students, new StuNameComparatorAsc());
//				displayAllStudents(students);
				StuNameComparatorAsc nameComp = new StuNameComparatorAsc();

				// sorting done on descending order of the elements
				Collections.sort(studentList, nameComp);

				System.out.println();
				System.out.println("After Sorting -> ");
				for (Student s : studentList)
					System.out.println(s);
				break;
			case 5:
				StuRollComparatorDesc rollComp = new StuRollComparatorDesc();

				// sorting done on descending order of the elements
				Collections.sort(studentList, rollComp);

				System.out.println();
				System.out.println("After Sorting -> ");
				for (Student s : studentList)
					System.out.println(s);
				break;
			default:
				System.out.println("Wrong choice...");
				break;
			}
		}
		scanner.close();
	}

	public static void displayAllStudents(Student[] students) {

		System.out.println("*************************");
//		for (Student student : students) {
//			System.out.println(student);
//		}

		ListIterator<Student> itr = studentList.listIterator();
		while (itr.hasNext()) {
			Student name = itr.next();
			System.out.println(name);
			System.out.println("*************************");
		}
	}
}
