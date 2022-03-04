package For;

import java.util.*;

public class For_ExN24 {
	public static void ExN24 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #44(24)");
		System.out.println("Введите число x");
		int x = scanner.nextInt();
		scanner.nextLine();
		
		int Num = 1;
		int counter = 0;
		for(int i = 0; i < x ;i++) {
			System.out.print(Num + " ");
			counter++;
			if (counter >= Num) {
				Num++;
				counter = 0;
			}
		}
		System.out.println("");
		
		
		
		scanner.close();
	}
}