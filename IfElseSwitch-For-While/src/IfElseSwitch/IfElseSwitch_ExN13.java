package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN13 {
	public static void ExN13() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №13");
		System.out.println("Введите число ");
		int k = scanner.nextInt();
		scanner.nextLine();
		
		if (k % 4 == 0 && k != 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	
		scanner.close();
	}
}