package For;

import java.util.*;

public class For_ExN12 {
	public static void ExN12 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Задание #32(12)");
		System.out.println("Введите число x");
		int a = scanner.nextInt();
		scanner.nextLine();
		int num = a;
		int rotatedNum = 0;
		for(int i = 0;i< String.valueOf(a).length();i++) {
			String intTimes = "1";
			for (int j = 0;j < String.valueOf(num).length() - 1;j++) {
				intTimes += "0";
			}
			rotatedNum += (num % 10) * Integer.parseInt(intTimes);
			
			
			num = num / 10;
		}
		System.out.println(rotatedNum);
	}
}