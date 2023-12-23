package operators;

import java.util.Scanner;

public class LogicalOperators {
	void logicalAnd(int num1, int num2, int num3){
		System.out.println(num1 > num2 && num1 > num3);
		System.out.println(num1 < num2 && num1 < num3);
		System.out.println(num1 > num2 && num1 < num3);
	}
	void logicalOr(int num1, int num2, int num3){
		System.out.println(num1 > num2 || num1 > num3);
		System.out.println(num1 < num2 || num1 < num3);
		System.out.println(num1 > num2 || num1 < num3);
	}
	void logicalNot(int num1,int num2){
		System.out.println(!(num1 > num2));
		System.out.println(!(num1 < num2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		LogicalOperators obj = new LogicalOperators();
		obj.logicalAnd(num1, num2, num3);
		obj.logicalNot(num1, num2);
		obj.logicalOr(num1, num2, num3);
		
		sc.close();
	}

}
