package homework4;
import java.util.ArrayList;
import java.util.regex.*;

public class QuestionEight {
	public static void answer(String arg) {
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(arg);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		while (m.find()) {
			m.group();
			int num = Integer.parseInt(m.group());
			numbers.add(num);
		}
		
		if(numbers.get(0) + numbers.get(1) == numbers.get(2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Test case 1: '1 + 2 = 3'");
		answer("1 + 2 = 3");
		System.out.println("Test case 2: '2 + 2 = 5'");
		answer("2 + 2 = 5");
	}
}
