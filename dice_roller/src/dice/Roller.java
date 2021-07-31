package dice;
import java.util.*;

class Dice {
	int sides;
	
	Dice(int sides){
		this.sides = sides;
	}
	
	public int roll(){
		Random randomGenerator=new Random();
		int result = randomGenerator.nextInt(sides) + 1;
		return result;
	}
}

class RollParser {
	String input;
	
	RollParser(String input){
		this.input = input;
	}
	
	public int[] rollNumbers() {
		String replaced_ = input.replace("+","d");
		String replaced = replaced_.replace("-", "d");
		
		String[] numbersStr = replaced.split("d");
		int[] numbersInt = new int[numbersStr.length];
		
		for (int i = 0; i < numbersStr.length; i++) {
			numbersInt[i] = Integer.parseInt(numbersStr[i]);
		}
		
		if (input.contains("-") & numbersInt.length == 3) {numbersInt[2] = -numbersInt[2];}
		
		return numbersInt;
	}
	
}


class Roller {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		boolean keepRunning = true;
		
		while (keepRunning == true) {
			System.out.println("What is your roll(enter x to quit): ");
			input = scan.next();
			
			if (input.equalsIgnoreCase("x")) {
				System.out.println("Quitting");
				return;
			} else if (!input.matches("(\\d{1,3}d\\d{1,3})((\\+|-)\\d{1,3})?")) {
				System.out.println("Wrong format");
				System.out.println("");
			} else {				
				RollParser parser = new RollParser(input);
				int[] diceNums = parser.rollNumbers();
				int numberOfDice = diceNums[0];
				int diceSides = diceNums[1];
				int modifier = (diceNums.length == 3) ? diceNums[2] : 0;
				
				int[] rolls = new int[numberOfDice+1];
				Dice dice = new Dice(diceSides);
				for (int i = 0; i < numberOfDice; i++) {
					int result = dice.roll();
					rolls[i] = result;
					int roll_num = i+1;
					System.out.println("Roll #"+roll_num+" : "+result);
				}
				rolls[rolls.length-1] = modifier;
				
				int total = Arrays.stream(rolls).reduce(0, (a,b) -> a + b);
				
				System.out.println("Modifier is : " + modifier);
				System.out.println("Final total : " + total);
				System.out.println("");			
			}
		}
	}
}
