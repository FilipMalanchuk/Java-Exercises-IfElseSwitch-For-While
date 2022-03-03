package For;

import java.util.*;

public class For_ExN9 {
	public static void ExN9 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #29(9)");
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		for(double i = a;i<b;i++) {
			if (Math.sqrt(i) % 1 == 0) {
				System.out.println(i);
			}
		}
	}
}