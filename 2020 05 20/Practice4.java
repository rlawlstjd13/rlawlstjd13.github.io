// 정수 2개를 입력받아서 큰 수에서~ 작은 수로 나눈 몫과 나머지를 출력

import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int div;
		int mod;
		
		if(number1 > number2) {
			div = number1 / number2;
			mod = number1 % number2;
		//System.out.println("몫" + (number1 / number2));
		//System.out.println("나머지" + (number1 % number2));
		}
		
		else {
			div = number2 / number1;
			mod = number2 % number1;
		//System.out.println("몫" + (number2 / number1));
		//System.out.println("나머지" + (number2 % number1));
		}
		System.out.println("몫:" + div);
		System.out.println("나머지:" + mod);
	}
}