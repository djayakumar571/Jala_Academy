package loops;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 == 0){
			System.out.println(n + " is an Even number");
		}
		else{
			System.out.println(n + " is an Odd number");
		}
		sc.close();
	}

}
