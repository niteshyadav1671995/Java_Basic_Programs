import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int no; 
		System.out.print("Enter length of the series : ");
		Scanner sc= new Scanner(System.in);
		no = sc.nextInt();
		int n1 = -1;
		int n2 = 1;
		int n3 ;
		for(int i = 0 ; i < no ; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}
	
}
