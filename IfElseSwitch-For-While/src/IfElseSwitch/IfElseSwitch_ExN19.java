package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN19 {
	public static void ExN19() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �19");
		System.out.println("������� ����� a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� c");
		int c = scanner.nextInt();
		scanner.nextLine();
		
		if (a == b && b == c) {
			System.out.println(3);
		} else if (a == b || b == c || a == c) {
			System.out.println(2);
		} else {
			System.out.println(0);
		}
		
		
	
		
		
	
		scanner.close();
	}
}