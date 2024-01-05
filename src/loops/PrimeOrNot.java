package loops;

import java.util.Scanner;

public class PrimeOrNot {
	
	static void primeNumber(int num){
		boolean isPrime = false;
		for(int i = 2; i <= num/2; ++i){
			if(num % i == 0){
				isPrime =true;
				break;
			}
		}
		if(!isPrime){
			System.out.println(num + " is a prime number");
		}
		else{
			System.out.println(num + " is not a prime number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeNumber(n);
		sc.close();
	}

}
