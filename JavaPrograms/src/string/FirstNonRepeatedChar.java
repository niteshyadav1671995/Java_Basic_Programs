package string;

import java.util.Scanner;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String inputString;
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter any String : ");
		inputString = inputScanner.next();
		int length = inputString.length();
		for(int i = 0; i < length ; i++) {
			char c = inputString.charAt(i);
			int repCharIndex = inputString.substring(inputString.indexOf(c)+1).indexOf(c);
			if(repCharIndex <= i) {
				System.out.println(c);
				break;
			}
		}
	}
}