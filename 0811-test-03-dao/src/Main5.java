import java.util.regex.Pattern;

public class Main5 {

	public static void main(String[] args) {
		// +는 1 이거나 이상  
		// ?는 0이거나1  
        // *는 0이거나 이상
		// \w 문자
		// \d 숫자
		// \s 공백
		Pattern p = Pattern.compile("\\w+");// \w는 이거지만 자바에선 \\w : [a-zA-Z]같고    

	}

}
