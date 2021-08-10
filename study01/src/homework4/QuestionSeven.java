package homework4;
import java.util.ArrayList;
import java.util.Random;

public class QuestionSeven {

	public static ArrayList<Integer> getNumbers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i = 0; i < 5; i++) {
			int randInt = rand.nextInt(30)+1;
			numbers.add(randInt);
		}
		return numbers;
	}
	
	public static ArrayList<Integer> onesOnly(ArrayList<Integer> numbers) {
		ArrayList<Integer> ones = new ArrayList<Integer>();
		
		for (int i = 0; i < numbers.size(); i++) {
			int num = numbers.get(i) % 10;
			ones.add(num);
		}
		return ones;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = getNumbers();
		ArrayList<Integer> ones = onesOnly(numbers);
		
		System.out.println("numbers: "+numbers);
		System.out.println("ones: "+ones);
		
		int[] a = new int[10];
		
		for (int i = 0; i < ones.size(); i++) {
			int num = ones.get(i);
			a[num] += 1;
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] > 0) {				
				System.out.println(i + ":" +a[i]);
			}
		}
		
	}

}
