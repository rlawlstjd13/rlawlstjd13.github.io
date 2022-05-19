// 1. 사용자가 입력한 정수가 0이상이며 7의 배수일 때 true를 출력하세요. 나머지 경우는 false

// 2. 사용자에게 3개의 정수를 입력받아 순서대로 입력된 수일 경우 true를 출력하세요. 나머지 경우는 false
// 예) 1 2 3 ->true, 4 5 6 -> true, 7 9 10 -> false

// 3. 사용자가 입력한 4자리의 정수가 좌우가 같을 때 true를 출력하세요. 나머지 경우는 false
// 예) 1221 -> true, 1557 -> false, 9009 -> true

import java.util.Scanner;
public class Work1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세용");
		int number = scan.nextInt();
		
		System.out.println(number % 7 == 0 && 0 <= number);
	}
}