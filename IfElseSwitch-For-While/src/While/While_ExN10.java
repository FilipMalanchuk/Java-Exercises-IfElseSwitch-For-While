package While;
import java.util.*;

public class While_ExN10 {
	public static void ExN10 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #60(10)");
		System.out.println("Введите число a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		scanner.nextLine();
		
		while (a > b) {
			if (a % 2 == 1) {
				a -= 1;
				System.out.println("-1");
			} else if (a / 2 >= b) {
				a = a / 2;
				System.out.println(":2");
			} else {
				a -= 1;
				System.out.println("-1");
			}
		}
		
		
		

		scanner.close();
	}
}