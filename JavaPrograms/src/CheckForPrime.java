import java.util.Scanner;

public class CheckForPrime {

	public static void main(String[] args) {
		int no ;
		Scanner sc = new Scanner(System.in);
		String choice;
		int temp ;
		int flag = 0;
		System.out.println("To check no. is prime or not prime");
		do {
			flag = 0;
			System.out.println("Enter a no.");
			no = sc.nextInt();
			temp = no/2;
			while(temp>1) {
				if(no % temp == 0 ) {
					flag = 1;
					break;
				}
				temp--;
			}
			if(flag == 0) {
				System.out.println("No. is Prime");
			}
			else {
				System.out.println("No. is not Prime");
			}
			System.out.print("Enter your choice (Y/N) to continue : ");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("y"));
	}
	
}
