package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN8 {
	public static void ExN8() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №8");
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
		int xDiff = x2 - x1;
		int yDiff = y2 - y1;
		
		if (xDiff == yDiff || xDiff == -yDiff) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	
		scanner.close();
	}
}