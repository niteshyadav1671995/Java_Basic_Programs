
public class FloydTriangle {

	public static void main(String[] args) {
		int lines = 5;
		int no = 0;
		for(int i=0 ; i<lines;i++ ) {
			for(int j = 0; j<=i;j++) {
				System.out.print(++no+" ");
				
			}
			System.out.println();
		}
	}
	
}
