package For;

import java.util.*;

public class For_ExN1 {
	public static void ExN1 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #21(1)");
		System.out.println("������� ����� n");
		int n = scanner.nextInt();
		scanner.nextLine();
		int sum = 0;
		for (int i = 1;i<n+1;i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println(sum);
	}
}
