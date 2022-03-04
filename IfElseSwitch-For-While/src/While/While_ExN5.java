package While;
import java.util.*;

public class While_ExN5 {
	public static void ExN5 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #55(5)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int itter = 1;
		int ans = 0;
		while (itter < x) {
			itter *= 2;
			ans++;
		}
		System.out.println(ans);

		scanner.close();
	}
}