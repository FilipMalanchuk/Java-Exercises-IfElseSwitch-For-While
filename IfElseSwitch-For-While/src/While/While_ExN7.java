package While;
import java.util.*;

public class While_ExN7 {
	public static void ExN7 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #57(7)");
		System.out.println("������� ����� x");
		int x = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� p");
		int p = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� y");
		int y = scanner.nextInt();
		scanner.nextLine();
		
		int years = 0;
		double curMoney = x;
		
		while (curMoney < y) {
			curMoney +=  ((curMoney / 100) * p);
			years++;
			curMoney = curMoney - (curMoney % 1);
		}
		System.out.println(years);

		scanner.close();
	}
}