package For;

import java.util.*;

public class For_ExN4 {
	public static void ExN4 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #24(4)");
		System.out.println("Введите число n");
		int n = scanner.nextInt();
		scanner.nextLine();
		double ans = 2;
		int factorial = 1;
		for (int i = 1;i<n;i++) {
			ans /= (factorial + 1);
			factorial *= i;
		}
		System.out.println(ans);
	}
}
