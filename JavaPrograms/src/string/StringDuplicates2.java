package string;

import java.util.Scanner;

public class StringDuplicates2 {

	public static void main(String[] args) {
		String inputString;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your String : ");
		inputString= sc.next();
		int length = inputString.length();
		char duplicates[] = new char[length];
		boolean isDuplicate = false;
		for(int i = 0 ; i < length; i++) {
			isDuplicate = false;
			char c = inputString.charAt(i);
			for(int j= 0 ; j< length ; j++) {
				if(c == duplicates[j]) {
					isDuplicate = true;
				}
			}
			if(!isDuplicate) {
				int index = inputString.indexOf(c , i+1);
				if(index > i) {
					duplicates[i] = c ;
					System.out.println(c);
				}	
			}
		}
	}
	
}
