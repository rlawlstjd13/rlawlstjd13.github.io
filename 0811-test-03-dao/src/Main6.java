import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main6 {

	public static void main(String[] args) {
		String line = "(abc, 123) | (de, 6) | (qwer, 15)";
		Pattern p = Pattern.compile("\\((\\w+), (\\d+)\\)"); //그룹을 만들어줄려면() ex) (abc) (123)
		Matcher m = p.matcher(line);
		
		while(m.find()) {
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}

	}

}
