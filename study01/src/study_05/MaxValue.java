package study_05;

import java.util.Arrays;

public class MaxValue {

	public static void main(String[] args) {
		int[] arr = {-3, -7, -6, -1};
//		int maxNum = Integer.MIN_VALUE;
//		for (int i = 1; i < arr.length; i++) {
//			maxNum = Math.max(maxNum, arr[i]);
//		}
//		System.out.println(maxNum);
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}

}
