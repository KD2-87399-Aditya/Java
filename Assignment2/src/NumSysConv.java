import java.util.Scanner;

public class NumSysConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept an integer number from the user
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        // Display the given number
        System.out.println("Given Number: " + number);

        // Convert and display the binary, octal, and hexadecimal equivalents
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hexadecimal = Integer.toHexString(number);

        System.out.println("Binary equivalent: " + binary);
        System.out.println("Octal equivalent: " + octal);
        System.out.println("Hexadecimal equivalent: " + hexadecimal);

        // Close the scanner
        scanner.close();
    }
}
