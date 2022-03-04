package While;
import java.util.*;

public class While_ExN8 {
	public static void ExN8 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #58(8)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int first = 1;
		int second = 1;
		
		int i = 2;
		
		while (i < x) {
			int temp = first + second;
			first = second;
			second = temp;
			
			i++;
		}
		System.out.println(second);

		scanner.close();
	}
}