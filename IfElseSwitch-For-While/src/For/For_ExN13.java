package For;

import java.util.*;

public class For_ExN13 {
	public static void ExN13 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #33(13)");
		System.out.println("������� ����� x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 2;i < x;i++) {
			if (x % i == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}