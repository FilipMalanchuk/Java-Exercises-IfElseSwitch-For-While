import java.util.Scanner;

import For.For_ExN1;
import For.For_ExN2;
import IfElseSwitch.*;
import For.*;
import While.*;
public class IfElseSwitch_For_While {

	public static void main(String[] args) {
		
		System.out.println("Введите номер задания");
		System.out.println("If Else Switch 1-20");
		System.out.println("For 21-44");
		System.out.println("While 51-76");
		Scanner scanner = new Scanner(System.in);
		int exToCheck = scanner.nextInt();
		
		switch (exToCheck) {	
		
		case 1:IfElseSwitch_ExN1.ExN1();
		break;
		case 2:IfElseSwitch_ExN2.ExN2();
		break;
		case 3:IfElseSwitch_ExN3.ExN3();
		break;
		case 4:IfElseSwitch_ExN4.ExN4();
		break;
		case 5:IfElseSwitch_ExN5.ExN5();
		break;
		case 6:IfElseSwitch_ExN6.ExN6();
		break;
		case 7:IfElseSwitch_ExN7.ExN7();
		break;
		case 8:IfElseSwitch_ExN8.ExN8();
		break;
		case 9:IfElseSwitch_ExN9.ExN9();
		break;
		case 10:IfElseSwitch_ExN10.ExN10();
		break;
		case 11:IfElseSwitch_ExN11.ExN11();
		break;
		case 12:IfElseSwitch_ExN12.ExN12();
		break;
		case 13:IfElseSwitch_ExN13.ExN13();
		break;
		case 14:IfElseSwitch_ExN14.ExN14();
		break;
		case 15:IfElseSwitch_ExN15.ExN15();
		break;
		case 16:IfElseSwitch_ExN16.ExN16();
		break;
		case 17:IfElseSwitch_ExN17.ExN17();
		break;
		case 18:IfElseSwitch_ExN18.ExN18();
		break;
		case 19:IfElseSwitch_ExN19.ExN19();
		break;
		case 20:IfElseSwitch_ExN20.ExN20();
		break;
		// начало задач на for
		case 21:For_ExN1.ExN1();
		break;
		case 22:For_ExN2.ExN2();
		break;
		case 23:For_ExN3.ExN3();
		break;
		case 24:For_ExN4.ExN4();
		break;
		case 25:For_ExN5.ExN5();
		break;
		case 26:For_ExN6.ExN6();
		break;
		case 27:For_ExN7.ExN7();
		break;
		case 28:For_ExN8.ExN8();
		break;
		case 29:For_ExN9.ExN9();
		break;
		case 30:For_ExN10.ExN10();
		break;
		case 31:For_ExN11.ExN11();
		break;
		case 32:For_ExN12.ExN12();
		break;
		case 33:For_ExN13.ExN13();
		break;
		case 34:For_ExN14.ExN14();
		break;
		case 35:For_ExN15.ExN15();
		break;
		case 36:For_ExN16.ExN16();
		break;
		case 37:For_ExN17.ExN17();
		break;
		case 38:For_ExN18.ExN18();
		break;
		case 39:For_ExN19.ExN19();
		break;
		case 40:For_ExN20.ExN20();
		break;
		case 41:For_ExN21.ExN21();
		break;
		case 42:For_ExN22.ExN22();
		break;
		case 43:For_ExN23.ExN23();
		break;
		case 44:For_ExN24.ExN24();
		break;
		// задачи на while
		case 51:While_ExN1.ExN1();
		break;
		case 52:While_ExN2.ExN2();
		break;
		case 53:While_ExN3.ExN3();
		break;
		case 54:While_ExN4.ExN4();
		break;
		case 55:While_ExN5.ExN5();
		break;
		case 56:While_ExN6.ExN6();
		break;
		case 57:While_ExN7.ExN7();
		break;
		case 58:While_ExN8.ExN8();
		break;
		case 59:While_ExN9.ExN9();
		break;
		case 60:While_ExN10.ExN10();
		break;
		
		default: System.out.println("Нету такого задания");
		break;
		}
		
		
		scanner.close();
		System.out.println("Программа отработала");

	}

}

