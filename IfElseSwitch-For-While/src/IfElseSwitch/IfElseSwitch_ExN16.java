package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN16 {
	public static void ExN16() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №16");
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число c");
		int c = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число d");
		int d = scanner.nextInt();
		scanner.nextLine();
		
		int price = a * 100 + b;
		int paid = c * 100 + d;
		int change = paid - price;
		System.out.println(change / 100 + " " + change % 100);
		
		
	
		scanner.close();
	}
}