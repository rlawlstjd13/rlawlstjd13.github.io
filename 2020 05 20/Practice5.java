// 3개의 정수를 입력받아
// 가장 큰 수를 출력하세요

import java.util.Scanner;

public class Practice5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해라");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		
		if (a > b) {
			 if (a > c) {
				 max = a;
			 }else{
				 max = c;
			 }
		} else {
			if (b > c) {
				max = b;
			}
			else {
				max = c;
			}7
		}

		System.out.println("가장 큰 변수는 : " + max);
	}
}
