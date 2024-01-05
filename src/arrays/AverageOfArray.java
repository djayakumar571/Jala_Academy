package arrays;

import java.util.Scanner;

public class AverageOfArray {
	static int arrAvg(int[] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		int res = sum / arr.length;
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(arrAvg(arr));
		sc.close();
	}

}
