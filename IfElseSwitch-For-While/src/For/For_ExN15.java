package For;

import java.util.*;

public class For_ExN15 {
	public static void ExN15 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #35(15)");
		System.out.println("������� ����� x");
		int x = scanner.nextInt();
		scanner.nextLine();
		int counter = 0;
		
		for(int i = 1;i < x+1;i++) {
			if (x % i == 0) {
				counter++;
			}
		}
		System.out.println(counter);
		
		scanner.close();
	}
}