import java.util.Scanner;

public class Work3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("money");
		int count = scan.nextInt(); // 돈 입력  10000
		
	    int num1 = 0;
		int num2 = 0;
		int other = 0;
		int sum = 0;
		for (int a = 0; a <= count; a++) {
			System.out.println("가격입력"); // 개수입력 3 5
			 int col = scan.nextInt(); // 1500
			 int ssa = scan.nextInt(); // 1300
			 
			 if (col == 1500 ) {
				 num1 += col;
			 } else if (ssa == 1300) {
				 num2 += ssa;
			 } 
		} System.out.println("총 개수 " + (num1 + num2));
		  System.out.println("거스름돈" + other);
	}
}