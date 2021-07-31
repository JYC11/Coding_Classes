package homework03;
import java.util.*;

public class QuestionOne {
	
	public static ArrayList<String> getNumbers() {
		ArrayList<String> numbers = new ArrayList<String>();
		Random rand = new Random();
		for(int i = 0; i < 5; i++) {
			int randInt = rand.nextInt(30)+1;
			numbers.add(Integer.toString(randInt));
		}
		return numbers;
	}
	
	public static ArrayList<String> splitNumbers(ArrayList<String> numbers) {
		ArrayList<String> splitNums = new ArrayList<String>();
		
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i).length() >= 2) {
				Collections.addAll(splitNums,numbers.get(i).split(""));  
			} else {
				splitNums.add(numbers.get(i));
			}
		}
		return splitNums;
	}
	
	public static ArrayList<String> removeDupes(ArrayList<String> splitNums) {
		Set<String> set = new LinkedHashSet<>();
		ArrayList<String> noDupes = new ArrayList<String>();
		set.addAll(splitNums);
		noDupes.addAll(set);
		return noDupes;
	}
	
	public static void main(String[] args) {
		ArrayList<String> numbers = getNumbers();
		ArrayList<String> splitNums = splitNumbers(numbers);
		ArrayList<String> noDupes = removeDupes(splitNums);
		
		System.out.println(numbers);
		System.out.println(splitNums);
		System.out.println(noDupes);
		
		for (int i = 0; i < noDupes.size(); i++) {
			String num = noDupes.get(i);
			int freq = Collections.frequency(splitNums, num);
			System.out.printf("%s appears %d times.%n",num,freq);
		}
		
	}
}
