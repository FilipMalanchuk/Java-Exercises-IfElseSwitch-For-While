package While;
import java.util.*;

public class While_ExN22 {
	public static void ExN22 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #72(22)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int sum = a;
		int zeroCounter = 0;
		boolean flag = true;
		
		while (flag) {
			a = scanner.nextInt();
			scanner.nextLine();
			sum += a;
			if (a == 0) {
				zeroCounter++;
			} else {
				zeroCounter = 0;
			}
			if (zeroCounter >= 2) {
				flag = false;
			}
			
			
		}
		System.out.println(sum);

		scanner.close();
	}
}