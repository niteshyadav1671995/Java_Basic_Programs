import java.util.Scanner;

public class Palindorme {

	public static void main(String[] args) {
		String inputString;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a String to check if palindrome : ");
		inputString = sc.next();
		char inputCharArray[] = inputString.toCharArray();
		int j= 0;
		int flag = 0;
		int i = inputCharArray.length-1;
		while(i/2 > 0) {
			if(inputCharArray[j] != inputCharArray[i]) {
				flag = 1;
				break ; 
			}
			i--;
			j++;
		}
		if(flag == 0) {
			System.out.println("Given String is palindrome ");
		}
	}
}
