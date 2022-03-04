package While;
import java.util.*;

public class While_ExN1 {
	public static void ExN1 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #51(1)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int itter = 1;
		while (Math.pow(itter, 2) < x) {
			System.out.println((Math.pow(itter, 2)));
			itter++;
		}
		
		
		
		
		
		
		scanner.close();
	}
}
