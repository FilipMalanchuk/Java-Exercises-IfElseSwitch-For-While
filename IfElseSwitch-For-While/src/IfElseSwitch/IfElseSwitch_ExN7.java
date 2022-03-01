package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN7 {
	public static void ExN7() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №7");
		System.out.println("Введите число x1");
		int x1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число y1");
		int y1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число x2");
		int x2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число y2");
		int y2 = scanner.nextInt();
		scanner.nextLine();
		
		if (x1 == x2 || y1 == y2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	
		scanner.close();
	}
}