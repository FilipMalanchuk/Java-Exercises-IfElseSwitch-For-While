package For;

import java.util.*;

public class For_ExN7 {
	public static void ExN7 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #27(7)");
		System.out.println("������� ����� a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = a + (a % 2);i<b;i = i + 2) {
			System.out.println(i);
		}
		
	}
}
