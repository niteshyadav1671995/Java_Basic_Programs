package string;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		String first;
		String second;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		first = sc.next();
		System.out.print("Enter Second String : ");
		second = sc.next();
		int firstLength = first.length();
		int secondLength = second.length();
		int count;
		int flag = 0;
		for(int i=0;i< firstLength;i++) {
			char c = first.charAt(i);
			flag = 0;
			count = 0;
			for(int j = 0; j < firstLength  ; j++) {
				if(first.charAt(j) == c) {
					count++;
				}
			}
			for(int j = 0; j < secondLength  ; j++) {
				if(second.charAt(j) == c) {
					count--;
				}
			}
			if(count == 0) {
				flag = 1;
			}
			else {
				break;
			}
			System.out.println(count);
		}
		if(flag == 1) {
			System.out.println("String are anagrams");
		}
		else {
			System.out.println("String are not anagrams");
		}
	}
	
}
