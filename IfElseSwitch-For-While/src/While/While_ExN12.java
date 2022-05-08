package While;
import java.util.*;

public class While_ExN12 {
	public static void ExN12 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #62(12)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int counter = 0;
		
		while (a != 0) {
			counter++;
			a = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println(counter);

		scanner.close();
	}
}