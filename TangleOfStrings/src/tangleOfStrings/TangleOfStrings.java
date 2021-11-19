
package tangleOfStrings;

import java.util.Scanner;

public class TangleOfStrings {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		input.useDelimiter(System.lineSeparator());
		
		myPassword();
		
		input.close();
	}

	public static void myPassword() {
		System.out.print("Input Password: ");
		String password = "";
		
		password = input.next();
		if (password.equals("me")) {
			menu();

		} else {
			System.out.println("Incorrect Password");
			
				myPassword();
			}
		}
	

	public static void menu() {
		System.out.println("Menu");
		System.out.println("1. Print String Backwards");
		System.out.println("2: Make a list of words in my string with a given length");
		System.out.println("3: Print out number of vowels in my string");
		System.out.println("4: Inverse the character case of my string");
		System.out.println("5: Compare to a 2nd string for content equality");
		System.out.println("6: Replace a word in your string with a new word");
		System.out.println("7: Quit");
		System.out.print("Select choice:");
		int selection = 0;
		selection = input.nextInt();

		if (selection == 1) {
			System.out.println("1. Print String Backwards");

			backwards();

			menu();
		}

		if (selection == 2) {
			System.out.println("2: Make a list of words in my string with a given length");
			length();
			menu();
		}

		if (selection == 3) {
			System.out.println("3: Print out number of vowels in my string");
			vowels();
			menu();
		}

		if (selection == 4) {
			System.out.println("4: Inverse the character case of my string");
			inverse();
			menu();

		}

		if (selection == 5) {
			System.out.println("5: Compare to a 2nd string for content equality");
			compare();
			menu();
		}

		if (selection == 6) {
			System.out.println("6: Replace a word in your string with a new word");
			replace();
			menu();
		}

		if (selection == 7) {
			System.out.println("7: Quit");
		}
		else {
			System.out.println("Please Enter a Valid Selection");
			menu();
		}
	}

	public static void backwards() {
		String word = "";
		word = input.next();
		for (int i = (word.length() - 1); i >= 0; i--) {
			System.out.print(word.charAt(i));

		}
		System.out.println();
	}


	public static void vowels() {
		String word = "";
		word = input.next();
		int amountOfVowels = 0; 
		//Set word equal to Word Lower Case
		word.toLowerCase();
		for (int i = 0; i < (word.length()); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u') {

				amountOfVowels++;
			}

		}
		System.out.print("Amount of Vowels: ");
		System.out.println(amountOfVowels);
	}

	public static void inverse() {
		String word = "";
		word = input.next();
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				System.out.print(Character.toLowerCase(word.charAt(i)));
			} else {
				System.out.print(Character.toUpperCase(word.charAt(i)));
			}
		}
		System.out.println();
	}

	public static void compare() {
		String word1 = "";
		String word2 = "";
		word1 = input.next();
		word2 = input.next();
		if (word1.equals(word2)) {
			System.out.println("They are the same");
		} else {
			System.out.println("They are not the same");
		}
	}

	public static void replace() {
		System.out.print("Input string: ");
		String word1 = "";

		String word2 = "";

		String word3 = "";
		word1 = input.next() + ' ';
		System.out.print("Input word to replace: ");
		word2 = input.next();
		System.out.print("Input word to put in its place: ");
		word3 = input.next();

		System.out.println(word1.toLowerCase().replace(word2.toLowerCase(), word3.toLowerCase()));

	}

	public static void length() {
		System.out.print("Input string: ");
		String word = "";
		word = input.next() + ' ';
		int givenlength;
		System.out.print("Input desired length: ");
		givenlength = input.nextInt();
		int start = 0;
		int end = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ' ') {
				end = i;
				String subword = word.substring(start, end);
				start = (end + 1);
				if (subword.length() == givenlength) {

					System.out.println(subword);
				}
			}
		}
	}

}
	
	
