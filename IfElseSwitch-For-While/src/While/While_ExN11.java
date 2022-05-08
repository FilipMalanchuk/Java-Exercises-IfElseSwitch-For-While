package While;
import java.util.*;

public class While_ExN11 {
	public static void ExN11 () {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������� #61(11)");
		System.out.println("������� ����� a");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� b");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������� ����� n");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		boolean flag = true; // ���� ��� �����
		String toPrint = ""; // ��� ������ � �������
		
		// �������� �� ������� �����
		if (n > a && n > b) {flag = false;}
		if (n == a) {System.out.println(">A");flag = false;}
		else if (n == b) {System.out.println(">B");flag = false;}
		
		// ���������� ����� ����� �������, ����� ������
		int min = 0;
		int max = 0;
		if (a > b) {max = a;min = b;}
		else {max = b;min = a;}
		
		// ��������� ���������� ��� �����
		int curA = 0;
		int curB = 0;
		int counter = 0;
		
		while (flag) {
			curA += min; toPrint += ">A\n";
			int curPosToAdd = max - curB; // ������� ����� ������ � ������������ �����
			
			// �������� � �����
			if (curPosToAdd >= curA) {
				curB += curA;
				curA = 0;
			}
			else {
				curB += curPosToAdd;
				curA -= curPosToAdd;
			}
			toPrint += "A>B\n";
			
			System.out.println(curA + " " + curB); // ��� ��������
			
			// �������� �� ����� ������
			if (curB == n) {
				flag = false;
			}
			if (curA == n ) {
				flag = false;
			}
			
			
			if (curB >= max && flag == true) {
				toPrint += "B>\n";curB = curA;toPrint += "A>B\n";curA = 0;
			}
			if (curA == n ) {
				flag = false;
			}
			if (counter == max) {toPrint = "";flag = false;}
			counter++;
			
		}
		if (toPrint.length() == 0) {toPrint = "impossible";}
		System.out.println("");
		System.out.println(toPrint);
		
		

		scanner.close();
	}
}