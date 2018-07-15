import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		int no;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a no. : ");
		no = sc.nextInt();
		int total = 0;
		int rem = no;
		int temp = no;
		while(rem != 0) {
			rem = temp % 10;
			total = total + rem * rem * rem ;
			temp = temp / 10;
		}
		if(no == total ) {
			System.out.println("No. is Armstrong");
		}
	}
	
}
