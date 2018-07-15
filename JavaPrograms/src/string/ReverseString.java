package string;

import java.util.Scanner;
/**
 * How to reverse String in Java using Iteration and Recursion? 
 * @author lenovo
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		String inputString ;
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a String to reverse : ");
		inputString = inputScanner.next();
		char inputCharArray[] = inputString.toCharArray();
		int length = inputCharArray.length-1;
		String result = "";
		while(length >= 0) {
			result = reverse(result , inputCharArray[length]);
			length--;
		}
		System.out.println("Reversed String : "+result);
	}
	
	public static String reverse(String result, char inputCharArray) {
		return result+inputCharArray;
	}
}