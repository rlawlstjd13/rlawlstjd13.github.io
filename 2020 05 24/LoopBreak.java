public class LoopBreak {
	public static void main(String[] args) {
		for (int i=0; i < 10; i++) {
			if (i == 5) {
				break; // 반복을멈출떄
			}
			System.out.println(i);
		}
		for (int i= 10; i < 20; i++) {
			if (i % 10 == 5) {
				continue; //break 랑 다르게 contunue 는 현재 관계를 건너뛴다
			}
			System.out.println(i);
		}
		
		int i = 20;
		while (i < 30) {
			//if (i == 25) {
				//continue;
			//}
			if (i != 25) { // 25 를 건너뛴다
			System.out.println(i);
			i++;
		}
		}
	}
}