import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

	public static void main(String[] args) {
		String line = "1 He2llo. 3 Wor4ld! 5";
		Pattern p = Pattern.compile("[0-9]");//[]대괄호는 한글자(한문자)
	    Matcher m = p.matcher(line);
	    
	    m.find();
	    System.out.println(m.start());
	    m.find();
	    System.out.println(m.start());
	    m.find();
	    System.out.println(m.start());
	    m.find();
	    System.out.println(m.start());
	    m.find();
	    System.out.println(m.start());
	    m.find();
	    System.out.println(m.start());
	    
		

	}

}
