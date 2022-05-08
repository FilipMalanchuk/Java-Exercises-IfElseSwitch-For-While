package While;
import java.util.*;

public class While_ExN23 {
	public static void ExN23 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #73(23)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int counter = 1;
		int prev = a;
		int maxRow = 0;
		
		while (a != 0) {
			a = scanner.nextInt();
			scanner.nextLine();
			if (a == prev) {
				counter++;
			} else {
				counter = 1;
			}
			if (counter > maxRow) {
				maxRow = counter;
			}
						
		}
		System.out.println(maxRow);

		scanner.close();
	}
}