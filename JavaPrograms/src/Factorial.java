import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factNo;
		int total = 1;
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter a No. : ");
		factNo = inputScanner.nextInt();
		while(factNo != 0) {
				total = recursion(total , factNo);
				factNo--;
		}
		System.out.println("Result : "+total);
		
	}
	
	public static int recursion(int total, int factNo) {
		return total * factNo;
	}
}