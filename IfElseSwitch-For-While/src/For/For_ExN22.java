package For;

import java.util.*;

public class For_ExN22 {
	public static void ExN22 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #42(22)");
		System.out.println("������� ����� a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� c");
		int c = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� d");
		int d = scanner.nextInt();
		scanner.nextLine();
		
		
		for(int i = 0;i <= 1000;i++) {
			if (a * Math.pow(i, 3) + b * Math.pow(i,2) + c * i + d == 0) {
				System.out.println(i);
			}
		}
		
		
		
		scanner.close();
	}
}