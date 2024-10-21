package com.app.fruits;
import java.util.Scanner;

public class FruitBasket {
	public static int menu(Scanner sc) {
		
		System.out.println("\nOptions:");
        System.out.println("0. Exit");
        System.out.println("1. Add Mango");
        System.out.println("2. Add Orange");
        System.out.println("3. Add Apple");
        System.out.println("4. Display names of all fruits in the basket");
        System.out.println("5. Display details of all fresh fruits in the basket");
        System.out.println("6. Display tastes of all stale fruits");
        System.out.println("7. Mark a fruit as stale");
        System.out.println("8. Mark all sour fruits as stale");
        System.out.print("Choose an option: ");
        return sc.nextInt();
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.print("Enter basket size: ");
        int basketSize = sc.nextInt();
        Fruit[] basket = new Fruit[basketSize]; 

        int counter = 0; 
        

        while ((choice = menu(sc))!= 0) {
//            System.out.println("\nOptions:");
//            System.out.println("0. Exit");
//            System.out.println("1. Add Mango");
//            System.out.println("2. Add Orange");
//            System.out.println("3. Add Apple");
//            System.out.println("4. Display names of all fruits in the basket");
//            System.out.println("5. Display details of all fresh fruits in the basket");
//            System.out.println("6. Display tastes of all stale fruits");
//            System.out.println("7. Mark a fruit as stale");
//            System.out.println("8. Mark all sour fruits as stale");
//            System.out.print("Choose an option: ");
//            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                case 1: 
                    if (counter < basketSize) {
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter color: ");
                        String color = sc.next();
                        basket[counter++] = new Mango(name, weight, color, true);
                        System.out.println("Mango added to the basket.");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2: 
                    if (counter < basketSize) {
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter color: ");
                        String color = sc.next();
                        basket[counter++] = new Orange(name, weight, color, true);
                        System.out.println("Orange added to the basket.");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3: 
                    if (counter < basketSize) {
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter color: ");
                        String color = sc.next();
                        basket[counter++] = new Apple(name, weight, color, true);
                        System.out.println("Apple added to the basket.");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4: 
                    System.out.println("Fruits in the basket:");
                    for (Fruit fruit : basket) {
                        if (fruit != null) {
                            System.out.println(fruit.getName());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Fresh fruits in the basket:");
                    for (Fruit fruit : basket) {
                        if (fruit != null && fruit.getIsFresh()) {
                            System.out.println(fruit.toString() + ", Taste: " + fruit.taste());
                        }
                    }
                    break;

                case 6: 
                    System.out.println("Tastes of stale fruits:");
                    for (Fruit fruit : basket) {
                        if (fruit != null && !fruit.getIsFresh()) {
                            System.out.println(fruit.taste());
                        }
                    }
                    break;

                case 7: 
                    System.out.print("Enter the index of the fruit to mark as stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < basketSize && basket[index] != null) {
                        basket[index].setIsFresh(false);
                        System.out.println("Fruit marked as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 8: 
                    for (Fruit fruit : basket) {
                        if (fruit != null && fruit.taste().equals("sour")) {
                            fruit.setIsFresh(false);
                        }
                    }
                    System.out.println("All sour fruits marked as stale.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
