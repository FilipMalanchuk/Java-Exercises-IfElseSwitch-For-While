package For;

import java.util.*;

public class For_ExN5 {
	public static void ExN5 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #25(5)");
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число n");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		int myPow = a;
		for (int i = 1;i<n;i++) {
			myPow *= a;
		}
		System.out.println(myPow);
	}
}
