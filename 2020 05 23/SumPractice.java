// 사용자가 몇 개의 정수를 입력할지 먼저 정한 후,
// 정수를 입력하면
// 합과 평균을 구해서 출력하는 프로그램

//짝수 입력의 평균
//홀수 입력의 평균
import java.util.Scanner;

public class SumPractice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			
		System.out.println("정수를 입력해!");
		int count = scan.nextInt();
		
		//int sum = 0;
		int num1 = 0;
		int num2 = 0;
		for (int a = 0; a < count; a++) {
			int sum = scan.nextInt();
	        if (sum % 2 == 0) {
			num2 += sum;
		}   else {
			num1 += sum;
		}
	}
		//System.out.println("합은" + sum);
		//System.out.println("평균은" + (sum / count ));
		System.out.println(" 짝수 입력의 평균" + num2);
		System.out.println(" 홀수 입력의 평균" + num1);
	}
	    
}