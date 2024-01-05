package loops;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(num != 0){
			int dig = num % 10;
			sum += (dig * dig * dig);
			num /= 10;
		}
		
		if(sum == temp){
			System.out.println(temp + " is an Amstrong number");
		}
		else{
			System.out.println(temp + " is not an Amstrong number");
		}
		sc.close();
	}
}
