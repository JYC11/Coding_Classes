package homework03;

public class QuestionThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		try {
			System.out.println("Adding '12' to the array 'a'");
			a[12] = 12;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
