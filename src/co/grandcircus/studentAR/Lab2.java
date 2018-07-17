package co.grandcircus.studentAR;

import java.util.Scanner;
//I'm making this change because David told me to
public class Lab2 {
	//This lab is better !!! because I added exclamation points!
	public static void main(String args[]) {
		Scanner scnr = new Scanner(System.in);
		char userInput = 'y';

		while (userInput == 'y') {

			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			System.out.println("Please enter the length of the classroom: ");
			double length = scnr.nextDouble();
			System.out.println("Please enter the width of the classroom: ");
			double width = scnr.nextDouble();
			System.out.println("Please enter the height of the classroom: ");
			double height = scnr.nextDouble();

			double perimeter = (length + length + width + width);
			double area = (length * width);
			double volume = (length * width * height);

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);

			System.out.println("Continue? (y/n): ");
			userInput = scnr.next().charAt(0);

			System.out.print("");

		}

	}
}