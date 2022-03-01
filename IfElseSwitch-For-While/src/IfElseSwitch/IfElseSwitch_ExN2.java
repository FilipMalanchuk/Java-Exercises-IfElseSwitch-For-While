package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN2 {
	public static void ExN2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №2");
		System.out.println("Введите год");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		if(a % 400 == 0) {
			System.out.println("YES");
		}
		else if (a % 4 == 0 && a % 100 != 0) {
			System.out.println("YES");
		} 
		else {
			System.out.println("NO");
		}
		
		scanner.close();
	}
}
