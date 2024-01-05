package arrays;

import java.util.Arrays;

public class RemoveElement {
	static int[] removeElement(int[] arr, int num){
		int[] anotherArr = new int[arr.length - 1];
		for(int i = 0, k = 0; i < arr.length; i++){
			if(arr[i] == num){
				continue;
			}
			anotherArr[k++] = arr[i];
		}
		return anotherArr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,8,11,25};
		System.out.println("Original array: " + Arrays.toString(arr));
		int num = 25;
		arr = removeElement(arr, num);
		System.out.println("Resultant array: " + Arrays.toString(arr));
		
	}

}
