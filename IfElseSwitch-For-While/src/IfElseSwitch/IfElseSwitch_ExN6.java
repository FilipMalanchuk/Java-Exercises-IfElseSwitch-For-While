package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN6 {
	public static void ExN6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №6");
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число с");
		int c = scanner.nextInt();
		scanner.nextLine();
		
		if (a > b) {
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
		
		
		
	
		scanner.close();
	}
}