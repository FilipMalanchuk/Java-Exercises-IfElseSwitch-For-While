package While;
import java.util.*;

public class While_ExN13 {
	public static void ExN13 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #63(13)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int sum = 0;
		
		while (a != 0) {
			sum+=a;
			a = scanner.nextInt();
			scanner.nextLine();
		}
		System.out.println(sum);

		scanner.close();
	}
}