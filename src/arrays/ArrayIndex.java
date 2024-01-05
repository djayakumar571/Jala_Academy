package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndex {
	static void arrIndex(int[] arr, int num){
		for(int i = 0; i < arr.length; i++){
			if(num == arr[i]){
				System.out.println(num + " is at index " + i);
				return;
			}	
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index;
		int[] arr = {11,25,35,46,55};
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("Select any value to find the index of array: ");
		index = sc.nextByte();
		arrIndex(arr, index);
		sc.close();
	}

}
