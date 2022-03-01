package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN17 {
	public static void ExN17() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №17");
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		boolean flag = false;
		
		for(int i = a;i > 0; i -=3) {
			if (i % 5 == 0) {
				flag = true;
			}
		}
		for(int i = a;i > 0; i -=5) {
			if (i % 3 == 0) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
	
		
		
	
		scanner.close();
	}
}