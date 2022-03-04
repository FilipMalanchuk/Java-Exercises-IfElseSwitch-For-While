package For;

import java.util.*;

public class For_ExN19 {
	public static void ExN19 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #39(19)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		int counter = 0;
		
		for(int i = 0;i < x;i++) {
			System.out.println("Введите число");
			int cur = scanner.nextInt();
			scanner.nextLine();
			if (cur == 0) {
				counter++;
			}
		}
		System.out.println(counter);
		
		scanner.close();
	}
}