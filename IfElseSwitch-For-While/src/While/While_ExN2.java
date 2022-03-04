package While;
import java.util.*;

public class While_ExN2 {
	public static void ExN2 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #52(2)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int itter = 2;
		boolean searchForAns = true;
		while (searchForAns) {
			if (x % itter == 0) {
				searchForAns = false;
				System.out.println(itter);
			}
			itter++;
		}
		

		scanner.close();
	}
}