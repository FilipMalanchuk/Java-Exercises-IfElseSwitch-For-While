package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN1 {
	public static void ExN1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №1");
		System.out.println("Введите число а");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		if (a > b) {System.out.println(a);}
		else {System.out.println(b);}
		
		scanner.close();
	}
}
