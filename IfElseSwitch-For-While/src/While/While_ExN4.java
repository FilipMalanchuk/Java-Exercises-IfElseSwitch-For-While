package While;
import java.util.*;

public class While_ExN4 {
	public static void ExN4 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #54(4)");
		System.out.println("������� ����� x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int itter = 1;
		String ans = "NO";
		while (itter <= x) {
			if (itter == x) {
				ans = "YES";
			}
			itter *= 2;
		}
		System.out.println(ans);

		scanner.close();
	}
}