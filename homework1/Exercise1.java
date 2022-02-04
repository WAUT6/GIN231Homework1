package homework1;

import java.util.Scanner;

public class Exercise1 {

	// Method to count the vowels
	public static int vowelCounter(String received) {

		int vowelOccurences = 0;// vowel counter

		received.toLowerCase();// this will help in checking the vowels and not worry about uppercase

		String[] array = new String[received.length()];// Creating an array of the same size of the received string
		array = received.split("");// this will split the string into an array for example "hi" will become [h,i]

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("a") || array[i].equals("i") || array[i].equals("o") || array[i].equals("e")
					|| array[i].equals("u")) {

				vowelOccurences++;// increase the counter by 1

			} else {

				continue;

			}

		}
		return vowelOccurences;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputToSend;

		Scanner s = new Scanner(System.in);

		System.out.println("What is the string you wish to send? ");
		inputToSend = s.next();// receiving user input

		System.out.println("There are " + vowelCounter(inputToSend) + " vowels in this string.");// calling the method
																									// and printing the
																									// result
	}

}
