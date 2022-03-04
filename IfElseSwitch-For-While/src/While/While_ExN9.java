package While;
import java.util.*;

public class While_ExN9 {
	public static void ExN9 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #59(9)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int first = 1;
		int second = 1;
		
		int i = 2;
		
		int ans = -1;
		
		while (second <= x) {
			int temp = first + second;
			first = second;
			second = temp;
			if (second == x) {
				ans = i + 1;
			}
			i++;
		}
		System.out.println(ans);

		scanner.close();
	}
}