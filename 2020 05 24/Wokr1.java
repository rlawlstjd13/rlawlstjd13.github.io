// 사용자에게 비밀번호를 물어보고 동일한 경우 통과
// 최대 3번의 기회를 줌
// 문자열로

import java.util.Scanner;
import java.util.Random;

public class Wokr1 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int password = random.nextInt(20);
		int number;
		boolean con = true;
		int n = 1;		
		while (con) {
			System.out.println("첫번째 로그인 시도");
			
			System.out.println("비밀번호를 입력하세요!!");
			if(con)
				number = scan.nextInt();
				System.out.println("비밀번호가 틀렸습니다.");
				System.out.println("두번째 로그인 시도");
			if (con)
				number = scan.nextInt();
			System.out.println("비밀번호가 틀렸습니다.");
				
			else  (false)
				System.out.println("마지막 기회");
				number = scan.nextInt();
				
				
			
			
		}
	} 
}