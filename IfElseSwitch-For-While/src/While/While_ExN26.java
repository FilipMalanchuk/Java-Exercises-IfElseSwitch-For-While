package While;
import java.util.*;

public class While_ExN26 {
	public static void ExN26 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #76(26)");
		System.out.println("Вводите числа");
		int a = scanner.nextInt();
		scanner.nextLine();
		int b = scanner.nextInt();
		scanner.nextLine();
		int c = scanner.nextInt();
		scanner.nextLine();
		int prevMaxID = 0;
		int counter = 3;
		int answer = 0;
		
		
		
	
		while (a != 0 && b != 0 && c != 0) {
			a = b;
			b = c;
			c = scanner.nextInt();
			scanner.nextLine();
			if (c != 0) {
				if (b > c && b > a) {
					if (prevMaxID != 0) {
						answer = counter - 1 - prevMaxID;
					}
					prevMaxID = counter - 1;
					
				}
			}
			
		}
		
		
		System.out.println(answer);

		scanner.close();
	}
}