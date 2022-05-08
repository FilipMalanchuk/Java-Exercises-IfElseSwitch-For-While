package While;
import java.util.*;

public class While_ExN17 {
	public static void ExN17 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #67(17)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int b = 0;
		int counter = 0;
		
		while (a != 0) {
			
			b = scanner.nextInt();
			scanner.nextLine();
			if (b > a) {
				counter++;
			}
			a = b;
			b = 0;
			
		}
		System.out.println(counter);

		scanner.close();
	}
}