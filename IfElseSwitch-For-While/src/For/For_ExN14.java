package For;

import java.util.*;

public class For_ExN14 {
	public static void ExN14 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #34(14)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 1;i < x+1;i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		
		
		scanner.close();
	}
}