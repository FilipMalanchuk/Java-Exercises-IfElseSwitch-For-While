package While;
import java.util.*;

public class While_ExN6 {
	public static void ExN6 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #56(6)");
		System.out.println("������� ����� x");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� y");
		int y = scanner.nextInt();
		scanner.nextLine();
		int days = 1;
		double curSpeed = x;
		while (curSpeed < y) {
			curSpeed +=  ((curSpeed / 100) * 10);
			days++;
		}
		System.out.println(days);

		scanner.close();
	}
}