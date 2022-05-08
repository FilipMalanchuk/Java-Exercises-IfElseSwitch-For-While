package While;
import java.util.*;

public class While_ExN25 {
	public static void ExN25 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #75(25)");
		System.out.println("Пример задания по условию не верен");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int b = scanner.nextInt();
		scanner.nextLine();
		int c = scanner.nextInt();
		scanner.nextLine();
		
		int counter = b > a && b > c ? 3 : 2;
		
	
		while (a != 0 && b != 0 && c != 0) {
			a = b;
			b = c;
			c = scanner.nextInt();
			scanner.nextLine();
			if (c != 0) {
				if (b > c && b > a) {
					counter++;
				}
			}
			
		}
		
		
		System.out.println(counter);

		scanner.close();
	}
}