package For;

import java.util.*;

public class For_ExN20 {
	public static void ExN20 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #40(20)");
		System.out.println("������� ����� x");
		int x = scanner.nextInt();
		scanner.nextLine();
		int counterZero = 0;
		int counterPos = 0;
		int counterNeg = 0;
		
		for(int i = 0;i < x;i++) {
			System.out.println("������� �����");
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
		System.out.println(counterZero + " �����, " + counterPos + " ����������, "+ counterNeg + " ����������");
		
		scanner.close();
	}
}