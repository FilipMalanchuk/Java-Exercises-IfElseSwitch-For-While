package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN10 {
	public static void ExN10() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �10");
		System.out.println("������� ����� x1");
		int x1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� y1");
		int y1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� x2");
		int x2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� y2");
		int y2 = scanner.nextInt();
		scanner.nextLine();
		int xDiff = x2 - x1;
		int yDiff = y2 - y1;
		xDiff = Math.abs(xDiff);
		yDiff = Math.abs(yDiff);
		
		if ((xDiff == 1 || xDiff == 0) && (yDiff == 1 || yDiff == 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	
		scanner.close();
	}
}