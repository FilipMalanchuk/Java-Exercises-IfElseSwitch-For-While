package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN6 {
	public static void ExN6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �6");
		System.out.println("������� ����� a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� �");
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