package While;
import java.util.*;

public class While_ExN21 {
	public static void ExN21 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #71(21)");
		System.out.println("������� ����� ����� �� ��� � #70(20) :/ ");
		System.out.println("������� �����");
		int a = scanner.nextInt();
		scanner.nextLine();
		int max = a;
		int counter = 1;
		
		while (a != 0) {
			
			a = scanner.nextInt();
			scanner.nextLine();
			if (a > max) {
				max = a;				
			} else if (a == max) {
				counter++;
			}
			
			
		}
		System.out.println(counter);

		scanner.close();
	}
}