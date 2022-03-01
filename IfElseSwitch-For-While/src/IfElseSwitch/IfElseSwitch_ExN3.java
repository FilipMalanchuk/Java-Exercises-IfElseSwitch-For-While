package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN3 {
	public static void ExN3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №3");
		System.out.println("Введите число");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Введите ответ");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		boolean symetric = false;
		int first = a / 1000;
		int second = (a % 1000) / 100;
		int third = (a % 100) / 10;
		int last = a % 10;
		
		if (first == last && second == third) {
			symetric = true;
		}
		
		if ((symetric && b == 1) || (!symetric && b != 1)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		
		
		scanner.close();
	}
}
