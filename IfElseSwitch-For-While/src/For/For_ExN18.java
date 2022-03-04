package For;

import java.util.*;

public class For_ExN18 {
	public static void ExN18 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #38(18)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		int num = x;
		int dec = 0;
		
		for(int i = 0;i < String.valueOf(x).length();i++) {
			int current = num % 10;
			dec += (Math.pow(2, i) * current);
			num = num / 10;
		}
		System.out.println(dec);
		
		scanner.close();
	}
}