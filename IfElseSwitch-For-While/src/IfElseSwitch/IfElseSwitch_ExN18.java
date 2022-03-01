package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN18 {
	public static void ExN18() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №18");
		System.out.println("Введите число k");
		int k = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число m");
		int m = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число n");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		double sumTime = ((n /k) * m)*2;
		System.out.println(sumTime);
		
		
	
		
		
	
		scanner.close();
	}
}