package For;

import java.util.*;

public class For_ExN21 {
	public static void ExN21 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #41(21)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		boolean zero = false;
		
		for(int i = 0;i < x;i++) {
			System.out.println("Введите число");
			int cur = scanner.nextInt();
			scanner.nextLine();
			if (cur == 0) {
				zero = true;
			}
		}
		if (zero) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
		scanner.close();
	}
}