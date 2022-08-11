import java.util.regex.Matcher;
import java.util.regex.Pattern;

//표현식 다루기
public class Main {

	public static void main(String[] args) {
		String line = "This is a book.";

		Pattern p = Pattern.compile("is");
		Matcher m = p.matcher(line); // line을 검사할수 있는 객체

		// System.out.println(m.lookingAt()); // 시작 부분이 일치 할때 트루

		boolean find = m.find(); // is를 찾아라?
		if (find) { // 찾았을때 시작점 과 끝 점을 알수있음. start, end 숫자로
			System.out.println(m.start());
			System.out.println(m.end());
		}

		find = m.find();
		if (find) {
			System.out.println(m.start());
			System.out.println(m.end());
		}
		
		find = m.find();
		if (find) {
			System.out.println("없음");
			
		}

	}

}
