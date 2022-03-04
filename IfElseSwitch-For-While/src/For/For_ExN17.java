package For;

import java.util.*;

public class For_ExN17 {
	public static void ExN17 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #37(17)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		int sum = 0;
		
		for(int i = 1;i < x+1;i++) {
			sum+= i;
		}
		System.out.println(sum);
		
		scanner.close();
	}
}