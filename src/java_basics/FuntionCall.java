package java_basics;

import java.util.Scanner;

public class FuntionCall {

	void printName(String name){
		System.out.println("My name is: " + name);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		FuntionCall obj = new FuntionCall();
		obj.printName(name);
		sc.close();
	}

}
