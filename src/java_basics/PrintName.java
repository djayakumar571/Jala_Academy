package java_basics;

import java.util.Scanner;

public class PrintName {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("My name is: " + name);
		sc.close();
	}
}
