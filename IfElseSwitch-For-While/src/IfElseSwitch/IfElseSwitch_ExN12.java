package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN12 {
	public static void ExN12() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �12");
		System.out.println("������� ����� n");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� m");
		int m = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� k");
		int k = scanner.nextInt();
		scanner.nextLine();
		
		if (k < (m * n) && ((k % n == 0)  || (k % m == 0))) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	
		scanner.close();
	}
}