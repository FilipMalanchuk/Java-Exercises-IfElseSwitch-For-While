package For;

import java.util.*;

public class For_ExN8 {
	public static void ExN8 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #28(8)");
		System.out.println("������� ����� a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� c");
		int c = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� d");
		int d = scanner.nextInt();
		scanner.nextLine();
		
		if (d != 0) {
			for (int i = a;i<b;i++) {
				if (i % d == c) {
					System.out.print(i + " ");
				}
			}
			System.out.println("");
		}
		
	}
}
