package While;
import java.util.*;

public class While_ExN3 {
	public static void ExN3 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #53(3)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int itter = 1;
		while (itter < x) {
			System.out.println(itter);
			itter *= 2;
		}
		

		scanner.close();
	}
}