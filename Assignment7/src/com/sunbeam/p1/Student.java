package com.sunbeam.p1;

import java.util.Comparator;
import java.util.Scanner;

class Student implements Comparator<Student> {
	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {
	}

	public Student(int roll, String name, String city, double marks) {
//		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [roll=" + roll + ", name=" + name + ", City=" + city + ", marks" + marks + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void accept(int roll, String name, String city, double marks) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll");
		roll = sc.nextInt();
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter City");
		city = sc.next();
		System.out.println("Enter roll");
		marks = sc.nextDouble();
	}

}

class StuCityComparatorAsc implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
}

class StuNameComparatorAsc implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class StuRollComparatorDesc implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o2.getRoll(), o1.getRoll());
	}
}

class StuMarksComparatorDesc implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return Double.compare(o2.getMarks(), o1.getMarks());
	}

}
