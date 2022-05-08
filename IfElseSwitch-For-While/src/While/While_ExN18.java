package While;
import java.util.*;

public class While_ExN18 {
	public static void ExN18 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #68(18)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int b = 0;
		int max = a;
		int secMax = 0;
		
		while (a != 0) {
			
			b = scanner.nextInt();
			scanner.nextLine();
			if (b > max) {
				secMax = max;
				max = b;				
			} else if (b > secMax) {
				secMax = b;
			}
			a = b;
			b = 0;
			
		}
		System.out.println(secMax);

		scanner.close();
	}
}