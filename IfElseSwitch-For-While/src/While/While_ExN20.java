package While;
import java.util.*;

public class While_ExN20 {
	public static void ExN20 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #70(20)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int max = a;
		int counter = 1;
		
		while (a != 0) {
			
			a = scanner.nextInt();
			scanner.nextLine();
			if (a > max) {
				max = a;				
			} else if (a == max) {
				counter++;
			}
			
			
		}
		System.out.println(counter);

		scanner.close();
	}
}