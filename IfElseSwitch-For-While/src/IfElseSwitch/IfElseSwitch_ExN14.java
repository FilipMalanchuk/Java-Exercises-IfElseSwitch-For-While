package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN14 {
	public static void ExN14() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �14");
		System.out.println("������� ����� a");
		double a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		double b = scanner.nextInt();
		scanner.nextLine();
		b = b * -1;
		
		if ((b / a) % 1 == 0) {
			System.out.println((int)(b / a));
		} else {
			System.out.println("NO");
		}
		
		
	
		scanner.close();
	}
}