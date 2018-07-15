package string;

import java.util.Scanner;
/**
 * How to check if a String contains only digits? 
 * @author lenovo
 *
 */
public class StringOnlyDigits {

	public static void main(String[] args) {
		String inputString;
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a String : ");
		inputString = inputScanner.next();
		char[] inputCharArray = inputString.toCharArray();
		int length = inputCharArray.length-1;
		int index = 0;
		int flag = 0;
		while(index <= length) {
			char c = inputCharArray[index];
			if( c < 48 || c > 57) {
				flag = 1;
				System.out.println("All Characters are not digits!");
				break;
			}
			index++;
		}
		if(flag == 0) {
			System.out.println("String contains only digits$$");
		}
	}
	
}
