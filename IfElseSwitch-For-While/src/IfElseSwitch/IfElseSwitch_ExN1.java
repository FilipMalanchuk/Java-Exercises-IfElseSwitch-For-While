package IfElseSwitch;

import java.util.*;
public class IfElseSwitch_ExN1 {
	public static void ExN1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �1");
		System.out.println("������� ����� �");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		if (a > b) {System.out.println(a);}
		else {System.out.println(b);}
		
		scanner.close();
	}
}
