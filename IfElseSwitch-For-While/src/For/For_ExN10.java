package For;

import java.util.*;

public class For_ExN10 {
	public static void ExN10 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #30(10)");
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		scanner.nextLine();
		int num = a;
		int counter = 0;
		for(int i = 0;i< String.valueOf(a).length();i++) {
			int check = num % 10;
			
			if (check == b) {
				counter++;
			}
			num = num / 10;
		}
		System.out.println(counter + " раз");
	}
}