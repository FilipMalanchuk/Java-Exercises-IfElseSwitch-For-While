package For;

import java.util.*;

public class For_ExN6 {
	public static void ExN6 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #26(6)");
		System.out.println("������� ����� n");
		int n = scanner.nextInt();
		scanner.nextLine();
		int factorial = 1;
		for (int i = 1;i<n+1;i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}
