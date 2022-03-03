package For;

import java.util.*;

public class For_ExN11 {
	public static void ExN11 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #31(11)");
		System.out.println("Введите число x");
		int a = scanner.nextInt();
		scanner.nextLine();
		int num = a;
		int sum = 0;
		for(int i = 0;i< String.valueOf(a).length();i++) {
			sum += num % 10;
			
			
			num = num / 10;
		}
		System.out.println(sum);
	}
}