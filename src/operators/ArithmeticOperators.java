package operators;

import java.util.Scanner;

public class ArithmeticOperators {
	
	int add(int num1, int num2){
		return num1 + num2;
	}
	
	int sub(int num1, int num2){
		return num1 - num2;
	}
	
	int mul(int num1, int num2){
		return num1 * num2;
	}
	
	int div(int num1, int num2){
		return num1 / num2;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		ArithmeticOperators obj = new ArithmeticOperators();
		System.out.println(obj.add(num1, num2));
		System.out.println(obj.sub(num1, num2));
		System.out.println(obj.mul(num1, num2));
		System.out.println(obj.div(num1, num2));
		sc.close();
	}
}
