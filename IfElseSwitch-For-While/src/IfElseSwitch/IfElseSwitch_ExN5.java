package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN5 {
	public static void ExN5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №5");
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		if (a > b) {
			System.out.println("1");
		} 
		else if (b > a) {
			System.out.println("2");
		} 
		else if (a == b) {
			System.out.println("0");
		}
		
	
		scanner.close();
	}
}