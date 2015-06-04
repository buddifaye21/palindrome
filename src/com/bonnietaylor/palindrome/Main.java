package com.bonnietaylor.palindrome;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = " ";
		Scanner keyboard = new Scanner(System.in);
		while(!str.equals("-999")){
			System.out.println("Please enter the string you would like to check(-999 to quit): ");
			str=keyboard.nextLine();
			if(!str.equals("-999"))
			{
				System.out.println(palindromeTwo(str));
			}
		}
	}

	public static String palindromeTwo(String str) {
		str = str.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return "false";
			}
		}
		return "true";
	}

}
