package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN15 {
	public static void ExN15() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �15");
		System.out.println("������� ����� a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� c");
		int c = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� d");
		int d = scanner.nextInt();
		scanner.nextLine();
		
		if (a == 0 && b == 0) {
			System.out.println("INF");
		} else if (a == 0 || (b * c == a * d)) {
			System.out.println("NO");
		} else if (b % a == 0) {
			System.out.println((b * -1) / a);
			
		} else {
			System.out.println("NO");
		}
		
		
	
		scanner.close();
	}
}