package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class ProjectDisplay {
	private static final String FILE_NAME = "projects.dat";
	private static HashSet<Projects> projectSet = new HashSet<>();

	public static void main(String[] args) {
		loadProjects();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Add Predefined Projects");
			System.out.println("2. Input Project from User");
			System.out.println("3. Display All Projects");
			System.out.println("4. Delete Project by Id");
			System.out.println("5. Copy Projects to ArrayList");
			System.out.println("6. Display Projects in ArrayList");
			System.out.println("7. Sort Projects by Cost");
			System.out.println("8. Find Project with Max Team Size");
			System.out.println("9. Count Projects with Java Technology");
			System.out.println("0. Exit and Save Projects");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addPredefinedProjects();
				break;
			case 2:
				inputProject(sc);
				break;
			case 3:
				displayProjects();
				break;
			case 4:
				deleteProjectById(sc);
				break;
			case 5:
				copyProjectsToList();
				break;
			case 6:
				displayProjectsInList();
				break;
			case 7:
				sortProjectsByCost();
				break;
			case 8:
				findMaxTeamSizeProject();
				break;
			case 9:
				countJavaProjects();
				break;
			case 0: {
				saveProjects();
				System.out.println("Projects saved. Exiting program...");
				return;
			}
			default:
				System.out.println("Invalid choice.");
			}
//			switch(choice) {
//			case 1:
//				addPredefinedProjects();
//			case 2:
//				inputProject(sc);
//			case 3:
//				displayProjects();
//			case 4:
//				deleteProjectById(sc);
//			case 5:
//				copyProjectsToList();
//			case 6:
//				displayProjectsInList();
//			case 7:
//				sortProjectsByCost();
//			case 8:
//				findMaxTeamSizeProject();
//			case 9:
//				countJavaProjects();
//			default:
//				System.out.println("Invalid Choice ");
//				
//				
//				
//				
//				
//			}
		}
	}

	private static void addPredefinedProjects() {
		projectSet.add(new Projects(1, "Train Reservation System", 5, 5000000, "Java"));
		projectSet.add(new Projects(2, "Airline Reservation System", 3, 6000000, ".NET"));
		projectSet.add(new Projects(4, "Online Grocery Shop", 6, 3000000, "Java"));
		projectSet.add(new Projects(5, "Online Book Shop", 2, 3000000, ".NET"));
		projectSet.add(new Projects(3, "Online Jewelry Shop", 4, 4000000, "Java"));
		projectSet.add(new Projects(6, "Bus Reservation System", 3, 3500000, "JS"));
		System.out.println("Predefined projects added.");
	}

	private static void inputProject(Scanner sc) {
		System.out.print("Enter Project ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Project Title: ");
		String title = sc.next();
		System.out.print("Enter Team Size: ");
		int teamSize = sc.nextInt();
		System.out.print("Enter Project Cost: ");
		double cost = sc.nextDouble();
		sc.nextLine(); // Consume newline
		System.out.print("Enter Technology: ");
		String tech = sc.next();

		Projects newProject = new Projects(id, title, teamSize, cost, tech);
		if (projectSet.add(newProject)) {
			System.out.println("Project added successfully.");
		} else {
			System.out.println("Project ID already exists. Duplicate not added.");
		}
	}

	private static void displayProjects() {
		projectSet.forEach(System.out::println);
	}

	private static void deleteProjectById(Scanner sc) {
		System.out.print("Enter Project ID to delete: ");
		int id = sc.nextInt();
		if (projectSet.remove(new Projects(id, "", 0, 0, ""))) {
			System.out.println("Project deleted successfully.");
		} else {
			System.out.println("Project not found.");
		}
	}

	private static void copyProjectsToList() {
		ArrayList<Projects> projectList = new ArrayList<>(projectSet);
		System.out.println("Projects copied to ArrayList.");
	}

	private static void displayProjectsInList() {
		ArrayList<Projects> projectList = new ArrayList<>(projectSet);
		projectList.forEach(System.out::println);
	}

	private static void sortProjectsByCost() {
		ArrayList<Projects> projectList = new ArrayList<>(projectSet);
		projectList.sort(Comparator.comparingDouble(Projects::getProjectCost));
		projectList.forEach(System.out::println);
	}

	private static void findMaxTeamSizeProject() {
		Projects maxTeamSizeProject = Collections.max(projectSet, Comparator.comparingInt(Projects::getTeamSize));
		System.out.println("Project with max team size: " + maxTeamSizeProject);
	}

	private static void countJavaProjects() {
		long count = projectSet.stream().filter(p -> "Java".equals(p.getTechnology())).count();
		System.out.println("Number of projects using Java technology: " + count);
	}

	private static void saveProjects() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
			oos.writeObject(projectSet);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadProjects() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			projectSet = (HashSet<Projects>) ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("No previous data found. Starting fresh.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
