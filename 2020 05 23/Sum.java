public class Sum {
	public static void main(String[] args) {
		// 0 ~ 100 범위의 정수의 합
		//int sum = 0;
		//for (int i = 0; i <= 100; i++) {
			//sum += i;
		//}
		//System.out.println(sum);
		
		
		
		// 100 ~ 200 사이의 짝수의 합
		
		int sum = 0;
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
			} else {
				System.out.println("아니다");
			}System.out.println(sum += a);
		}
		
	}
}