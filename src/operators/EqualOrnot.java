package operators;

import java.util.Scanner;

public class EqualOrnot {
	void equalOrNot(int num1, int num2){
		if(num1 == num2){
			System.out.println("Both are equal numbers");
		}
		else if(num1 != num2){
			System.out.println("Both are not equal numbers");
		}
	}
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		EqualOrnot obj = new EqualOrnot();
		obj.equalOrNot(num1, num2);
		num.close();
	}
}
