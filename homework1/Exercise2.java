package homework1;

import java.util.Scanner;

public class Exercise2 {

	public static double babylonian(double n) {

		double guess = n / 2;// random guess

		double previousGuess = 0;

		do {

			double r = n / guess;

			previousGuess = guess;// previousGuess becomes the old guess before the next computation of guess

			guess = (guess + r) / 2;

		} while (previousGuess - guess > 0.0001);// checking for the 0.01% difference

		return guess;

	}

	public static double babylonian(double n, int iterations) {

		double guess = n / 2;// random guess

		int counter = 0;// to end the loop at i iterations

		do {

			double r = n / guess;

			guess = (guess + r) / 2;

			counter++;// increase by 1 every loop iterations

		} while (counter <= iterations);

		return guess;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		double n;

		System.out.println("What is the number you wish to compute the square root of?");
		n = s.nextDouble();

		System.out.printf("The square root of " + n + " is : " + String.format("%.2f", babylonian(n, 10)));

		System.out.println();

		System.out.printf("The square root of " + n + " is : " + String.format("%.2f", babylonian(n)));

	}

}
