import java.util.Scanner;
public class AverageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		double num1=0, num2=0;
		System.out.println("Enter 1st number:");
		if(sc.hasNextDouble()) {
			num1 = sc.nextDouble();
			
		}else {
			System.out.println("Number is not double");
			sc.close();
		}
		System.out.println("Enter 2nd Number: ");
		if(sc.hasNextDouble()) {
			num2 = sc.nextDouble();
		}else {
			System.out.println("Number 2 is not double");
			sc.close();
		}

		double avg = (num1 + num2)/2;
		System.out.println("Average: " + avg);
		
	}

}
