public class TestString2 {
	public static void main(String[] args) {
		String hello = "Hello"; // 0,1,2,4,5   String 은 문자열 "" 써야함.
		
		char h = hello.charAt(0); //scanner 같은거?
		System.out.println(h);
		System.out.println(hello.charAt(1));
		//System.out.println(hello.charAt(-1)); 음수는안됨
		System.out.println(hello.charAt(2));
		System.out.println(hello.charAt(3));
		System.out.println(hello.charAt(4));
		
		int length = hello.length();
		System.out.println(length); // length 는 몇글자 인지 알려줌 정수로
	}
}