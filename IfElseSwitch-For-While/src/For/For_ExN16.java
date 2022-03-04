package For;

import java.util.*;

public class For_ExN16 {
	public static void ExN16 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #36(16)");
		int sum = 0;
		
		for(int i = 1;i < 101;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		scanner.close();
	}
}