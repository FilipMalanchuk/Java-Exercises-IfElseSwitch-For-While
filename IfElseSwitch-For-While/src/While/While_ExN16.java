package While;
import java.util.*;

public class While_ExN16 {
	public static void ExN16 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #66(16)");
		System.out.println("������� �����");
		int a = scanner.nextInt();
		scanner.nextLine();
		int max = a;
		
		while (a != 0) {
			
			a = scanner.nextInt();
			scanner.nextLine();
			if (a > max) {
				max = a;
			}
		}
		System.out.println(max);

		scanner.close();
	}
}