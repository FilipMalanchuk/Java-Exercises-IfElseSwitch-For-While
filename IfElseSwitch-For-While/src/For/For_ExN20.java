package For;

import java.util.*;

public class For_ExN20 {
	public static void ExN20 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #40(20)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		int counterZero = 0;
		int counterPos = 0;
		int counterNeg = 0;
		
		for(int i = 0;i < x;i++) {
			System.out.println("Введите число");
			int cur = scanner.nextInt();
			scanner.nextLine();
			if (cur == 0) {
				counterZero++;
			} else if (cur > 0) {
				counterPos++;
			} else if (cur < 0) {
				counterNeg++;
			}
		}
		System.out.println(counterZero + " Нулей, " + counterPos + " позитивных, "+ counterNeg + " негативных");
		
		scanner.close();
	}
}