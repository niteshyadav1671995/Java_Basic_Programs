import java.util.Scanner;

public class SwappingWithoutThirdVaiable {

	public static void main(String[] args) {
		int n1 , n2;
		Scanner inputScanner= new Scanner(System.in);
		System.out.print("Enter First No. : ");
		n1 = inputScanner.nextInt();
		System.out.print("Enter Second No. : ");
		n2 = inputScanner.nextInt();
		System.out.println("No. Before Swapping : \n First : "+n1+"\n Second : "+n2);
		n1 = n1+n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.print("No. After Swapping : \n First : "+n1+"\n Second : "+n2);
		
	}
	
}