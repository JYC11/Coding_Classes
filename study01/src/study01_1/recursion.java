package study01_1;

import com.sun.jdi.Method;

public class recursion {
	
	//Basic recursion example
	public static void method(int n) {
		if (n==0)
			return;
		System.out.println(n);
		
		method(--n);
	}
	
	//Factorial example
	public static int factorial(int n) {
		if(n==1) {
			return n;
		} else {
			int result = n * factorial(--n);
			return result;
		}
	}
	
	//Fibonacci example
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n-2) + fibonacci(n-1);
		}
		
	}
	
	
	//printing factorial result
//	public static void main(String[] args) {
//		System.out.println(factorial(3));
//	}
	
	//printing fibonacci result
	public static void main(String[] args) {
		int max = 10;
		System.out.println("Fibonacci series of "+max+" length");
		for(int i = 0; i < max; i++) {
			System.out.print(fibonacci(i)+" ");
		}
		
	}
	
	
};