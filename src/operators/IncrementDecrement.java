package operators;

import java.util.Scanner;

public class IncrementDecrement {
	int preIncrement(int num1, int num2){
		return num2 + (++num1);
	}
	int postIncrement(int num1, int num2){
		return num2 + (num1++);
	}
	int preDecrement(int num1, int num2){
		return num2 + (--num1);
	}
	int postDecrement(int num1, int num2){
		return num2 + (num1--);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		IncrementDecrement obj = new IncrementDecrement();
		System.out.println(obj.preDecrement(num1, num2));
		System.out.println(obj.postDecrement(num1, num2));
		System.out.println(obj.preIncrement(num1, num2));
		System.out.println(obj.postIncrement(num1, num2));
		sc.close();
	}

}
