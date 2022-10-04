package WhileLoopDemo;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int number, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n please Enter any integer value below 10: ");
		number = sc.nextInt();
		
		while (number <= 10) {
			sum = sum + number;
			number++;
		}
		System.out.format7("Sum of the Numbers From the While Loop is: %d",sum);
		

	}

}
