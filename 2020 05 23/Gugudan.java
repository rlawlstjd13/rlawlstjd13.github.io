import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
		// 4 * 1 = 4
		// 4 * 2 = 8
		// 4 * 3 = 12
		// 4 * 4 = 16
		// 4 * 5 = 20
		// 4 * 6 = 24
		// 4 * 7 = 28
		// 4 * 8 = 32
		// 4 * 9 = 36
		
		//int i = 1;
		//while (i <= 9) {
		//System.out.printf("%d * %d = %d\n", 4, i, 4 * i);
		//i++;
		//}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력해");
		int a = scan.nextInt();
		
		int i = 1;
		while (a <= 9) {
			System.out.printf("%d * %d = %d\n", a, i, 9 * i);
		} i++;
		
		
		
	}
}