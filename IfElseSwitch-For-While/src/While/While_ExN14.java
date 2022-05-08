package While;
import java.util.*;

public class While_ExN14 {
	public static void ExN14 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #64(14)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		double sum = 0;
		int counter = 0;
		
		while (a != 0) {
			sum+=a;
			counter++;
			a = scanner.nextInt();
			scanner.nextLine();
		}
		if (counter == 0) {
			System.out.println(sum);
		} else {
			System.out.println(sum / counter);
		}

		scanner.close();
	}
}