// 0부터 1씩 증가하는 수를 출력하기
// 사용자가 원하는 반복 만큼만.

import java.util.Scanner;

public class LoopPractice {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" 반복 횟수 입력 ");
		int a = scan.nextInt();
		
		int b = 0;
		while(b < a) {
			System.out.println(b);
			b++;
		}
		
	}
}