package person;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonValidator {
	// 이름 10자
	// 맵으로 담아서 키는 맵의 길이,맵의 공백,맵 한영, 맵 널을 넣고 밸류값에 안내문자를 넣는다?
	public Map<String, String> isValidName(String name) {
		Map<String, String> map = new HashMap<String, String>();
		if (name != null) {
			int length = name.length();
			if (length == 0 || length > 10) {
				map.put("namelength", "이름의 글자수는 1~10자 이어야 합니다.");
			}

			if (name.contains(" ")) {
				map.put("nameSpace", "이름에 공백 포함 불가요~");
			}

			Pattern p = Pattern.compile("[a-zA-Z가-힣]+");
			Matcher m = p.matcher(name);
			if (!m.matches()) {
				map.put("nameChar", "이름은 한글 또는 영문자이여야 합니다.");
			}
		} else {
			map.put("nameNull", "이름을 입력해줘용!");
		}
		return map;
	}

	// 나이 정수
	public Map<String, String> isValidAge(String age) {
		Map<String, String> map = new HashMap<String, String>();
		if (age != null) {
			Pattern p = Pattern.compile("\\d+");
			Matcher m = p.matcher(age);

			if (!m.matches()) {
				map.put("ageFormat", "나이는 숫자만 허용됩니다.");
			} else {
				try {
					int num = Integer.valueOf(age);

					if (num < 15 || num > 99) {
						map.put("ageRange", "나이의 범위는 15 - 99세입니다");
					}
				} catch (NumberFormatException e) {
					map.put("ageRange", "나이의 범위는 15 - 99세입니다");
				}
			}
		} else {
			map.put("ageNull", "나이를 입력하세요~");
		}
		return map;
	}

	// 이메일 50자
	// email RegEx 검색하면 자주쓰는건 나옴.
	public Map<String, String> isValidEmail(String email) {
		Map<String, String> map = new HashMap<String, String>();

		if (email != null) {
			if (email.length() > 50) {
				map.put("emailLength", "이메일은 최대 50자 입니다.");
			}

			Pattern p = Pattern.compile("^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\\\w+\\\\.)+\\\\w+$\r\n");
			Matcher m = p.matcher(email);
			if (!m.matches()) {

			}
		} else {
			map.put("emailNull", "이메일을 입력해~");
		}
		return map;

	}
}
