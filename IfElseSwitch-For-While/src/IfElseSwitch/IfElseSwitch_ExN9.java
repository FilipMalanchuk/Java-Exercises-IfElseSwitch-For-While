package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN9 {
	public static void ExN9() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №9");
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
		
		if ((xDiff == yDiff || xDiff == -yDiff) || (x1 == x2 || y1 == y2)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	
		scanner.close();
	}
}