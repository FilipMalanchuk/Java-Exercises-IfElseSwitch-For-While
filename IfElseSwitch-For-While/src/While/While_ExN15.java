package While;
import java.util.*;

public class While_ExN15 {
	public static void ExN15 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #65(15)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int counter = 0;
		
		while (a != 0) {
			if (a % 2 == 0) {
				counter++;
			}
			a = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println(counter);

		scanner.close();
	}
}