package com.sunbeam;
import java.util.Scanner;

public class EmployeeTest {
   	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            
            System.out.print("Enter employee First name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter employee Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter employee salary: ");
            double salary = scanner.nextDouble();

            
            Employee employee = new Employee(firstName, lastName, salary);


            employee.displayDetails();

            scanner.close();
        
    }
}
