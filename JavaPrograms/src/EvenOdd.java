import java.util.Scanner;

public class EvenOdd {

	
	public static void main(String args[]) {
		int n1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a no. to check Even or Odd : ");
		n1 = sc.nextInt();
		if(n1 % 2 == 0) {
			System.out.println("No. is Even");
		}else {
			System.out.println("No. is Odd");
		}
	}
	
}
