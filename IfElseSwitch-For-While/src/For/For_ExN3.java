package For;

import java.util.*;

public class For_ExN3 {
	public static void ExN3 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #23(3)");
		System.out.println("Введите число n");
		int n = scanner.nextInt();
		scanner.nextLine();
		int myPow = 2;
		for (int i = 1;i<n;i++) {
			myPow *= 2;
		}
		System.out.println(myPow);
	}
}
