package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN4 {
	public static void ExN4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �4");
		System.out.println("������� �����");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		if (a > 0) {
			System.out.println("1");
		}
		else if (a < 0) {
			System.out.println("-1");
		}
		else if (a == 0) {
			System.out.println("0");
		}
	
		scanner.close();
	}
}
