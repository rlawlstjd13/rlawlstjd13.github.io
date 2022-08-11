import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

	public static void main(String[] args) {
		String line = "123 Hello. 39 Wor48ld! 57";
		Pattern p = Pattern.compile("[0-9]{2,3}"); //[]에서 {}는 2자리에서 3자리수
		Matcher m = p.matcher(line);
		
		m.find();
		System.out.println(m.start());
		System.out.println(m.end());
		
		m.find();
		System.out.println(m.start());
		System.out.println(m.end());
	}

}
