package string;

import java.util.Scanner;

public class StringDuplicates {

	public static void main(String[] args) {
		String inputString;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your String : ");
		inputString= sc.next();
		char duplicateChar[] = new char[5];
		char inputArray[] = inputString.toCharArray();
		int length = inputArray.length;
		for(int i = 0 ; i < length; i++) {
			for(int j = i+1 ; j< length ; j++) {
				if(inputArray[i] == inputArray[j]) {
					duplicateChar[i] = inputArray[i];
				}
			}
		}
	}
	
}
