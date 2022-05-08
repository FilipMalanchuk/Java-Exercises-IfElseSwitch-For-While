package While;
import java.util.*;

public class While_ExN24 {
	public static void ExN24 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #74(24)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int b = scanner.nextInt();
		scanner.nextLine();
		int maxRow = a > b || b > a ?  2 : 1;
		int counter = maxRow;
		boolean more = b > a ? true : false;
	
		while (a != 0 && b != 0) {
			a = b;
			b = scanner.nextInt();
			scanner.nextLine();
			boolean curMore = b > a ? true : false;
			
			if (more == curMore && b != 0) {
				counter++;
			} else {
				counter = 2;
				more = b > a ? true : false;
				if (a == b) {
					counter = 0;
				}
			}
			
			if (counter > maxRow) {
				maxRow = counter;
			}
			
		}
		
		
		System.out.println(maxRow);

		scanner.close();
	}
}

