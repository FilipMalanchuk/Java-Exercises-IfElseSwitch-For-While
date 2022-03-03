package For;

import java.util.*;

public class For_ExN2 {
	public static void ExN2 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #22(2)");
		System.out.println("Введите число n");
		int n = scanner.nextInt();
		scanner.nextLine();
		int factorial = 1;
		for (int i = 1;i<n+1;i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}
