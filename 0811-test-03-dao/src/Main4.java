import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {

	public static void main(String[] args) {
		String line1 = "lowercase";
		String line2 = "UPPERCASE";
		String line3 = "1q2w3e";

//		Pattern p = Pattern.compile("[A-Z]{9}");//[a~z]까지 9글자인 문자열
//		Matcher m1 = p.matcher(line2);
//		
//		System.out.println(m1.matches());// m1이랑 line1이랑 일치하면 트루 

//		Pattern p = Pattern.compile("[0-9a-z]{6}");// []대갈호안에 숫자와 문자 동시검사가능
//		Matcher m = p.matcher(line3);
//		System.out.println(m.matches());

		// 아이디는 영소문자와 숫자로 이루어져야하고 최대 10자임 (영문자로 시작해야합니다.)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("아이디를 입력하세요");
//		String id = scan.nextLine();
//
//		Pattern p = Pattern.compile("[a-z0-9][a-z]{6,10}");
//		Matcher m = p.matcher(id);
//
//		if (m.matches()) {
//			System.out.println("유효한 ID");
//		} else {
//			System.out.println("불가");
//		}


		// 올바른 전화번호(010-####-####)
		String regex= "010-[0-9]{4}-[0-9]{4}";
		
		Pattern p = Pattern.compile(regex);
		System.out.println(p.matcher("010-1234-5678").matches());
		System.out.println(p.matcher("010-1234-aaaa").matches());
		System.out.println(p.matcher("010-@#$%-5678").matches());
		System.out.println(p.matcher("010-1234-5678").matches());
		

	}

}
