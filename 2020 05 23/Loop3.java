public class Loop3 {
	public static void main(String[] args) {
		// 0부터  100사이의 수 중 3의 배수 또는 7의 배수를 출력해보세요.
		// 3 6 7 9 12 15....
		
		//int x = 0;
		//while ( x <= 100) {
			//if ( x % 3 == 0 || x % 7 == 0) {
				//System.out.println(x);
			//} 
			//x += 3;
		//} 
		// 0 부터 100중 일의자리수가 3, 6, 9 일떄만 출력;
		
		int y = 0;
		while ( y <= 100) {
			if (y % 10 == 3 || y % 10 == 6 || y % 10 == 9) {
				System.out.println(y);
			}
			y += 3;	
		}
	}
}
  