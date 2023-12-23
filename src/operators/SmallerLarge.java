package operators;

import java.util.Scanner;

public class SmallerLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1>num2 ? "num1 is greater" : "num2 is greater");
		System.out.println(num1<num2 ? "num1 is smaller" : "num2 is smaller");
		sc.close();
	}

}
