public class TestMethod3 {
	public static int getSum(int a, int b) { // ()이름은 parameters 개수똑같게, 타입똑같게, 순서
		return a + b;
		
	}
	//두개 int 정수를 전달받아 곱 연산결과를 반환하는 메소드를 작성하고 호출해 반환값을 메인메소드에서 출력해보세요.
	
	public static int getGop (int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		int sum = getSum(30, 60);
		//System.out.println(sum);
		
	    //System.out.println(getSum(100, 200));
		
		int gop = getGop(50, 60);
		System.out.println(gop);
		
		System.out.println(getGop(2, 6));
	}
}