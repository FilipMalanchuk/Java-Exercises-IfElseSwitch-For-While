package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN20 {
	public static void ExN20() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание №20");
		System.out.println("На лузі пасеться ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		if(n % 10 == 0 || n % 10 > 4) {
			System.out.println(" корів");
		} else if (n % 10 == 1) {
			System.out.println(" корова");
		} else {
			System.out.println(" корови");
		}
		
		
	
		
		
	
		scanner.close();
	}
}