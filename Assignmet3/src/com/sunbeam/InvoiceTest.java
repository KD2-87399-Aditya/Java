package com.sunbeam;
import java.util.Scanner;

public class InvoiceTest
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Invoice I1 = new Invoice();
		
		int choice = 0;
		// TODO Auto-generated method stub
		double totalBill = 0;

		while(choice != 4)
		{
			System.out.println("------Menu-------");
			System.out.println("1. Add items");
			System.out.println("2. Display items");
			System.out.println("3. Generate Bill");
			System.out.println("4. Exit");
			System.out.println("-----------------");

			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) 
			{

			case 1: 
					I1.accept();
					
			break;

			case 2: 
					I1.menu();
					I1.display();
			break;

			case 3: 
					System.out.println("-----------------------");
					totalBill += I1.totalPrice();
					System.out.println("Your Bill:" +totalBill);
			break;

			case 4: 
					System.out.println("Your Bill:" +totalBill);
					System.exit(choice);
			break;
			
			}
		}		
	}

}